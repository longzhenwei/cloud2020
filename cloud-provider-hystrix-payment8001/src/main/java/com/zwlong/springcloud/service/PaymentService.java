package com.zwlong.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @Author 龙振威
 * @Date 2020/9/17 21:42
 */
@Service
public class PaymentService {
    /***
     * 正常访问得
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"paymentinfo_OK,id:"+id;
    }

    /***
     * 睡眠三秒
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentInfo_Timeout(Integer id){
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+"paymentinfo_Timeout,id:"+id;
    }

    /**
     * 服务降级兜底方法
     * @param id
     * @return
     */
    public String paymentInfo_TimeoutHandler(Integer id){
        return "线程池："+Thread.currentThread().getName()+"port: 8001 系统繁忙或者出现错误，请重试！,id:"+id;
    }

    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name="circuitBreaker.enabled",value = "true"),/*开启服务熔断*/
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="10"),/*请求次数*/
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value="10000"),/*时间窗口期  经过多久后恢复尝试调用*/
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value="60")/*失败率达到得百分比后跳闸*/
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        if(id<0){
            throw new RuntimeException("******id 不能是负数");
        }
        String serialNumber= IdUtil.simpleUUID();
        return Thread.currentThread().getName()+"\t"+"调用成功，流水号："+serialNumber;
    }
    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id){
        return "id 不能为负数，请修改后重试，id:"+id;
    }


}
