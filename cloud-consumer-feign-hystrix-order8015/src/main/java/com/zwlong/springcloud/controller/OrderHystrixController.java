package com.zwlong.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zwlong.springcloud.service.OrderHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 龙振威
 * @Date 2020/9/17 22:42
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {

    @Resource
    private OrderHystrixService orderHystrixService;


    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result=orderHystrixService.paymentInfo_OK(id);
        return result;
    }

    /*@HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "1500")
    })*/
    @HystrixCommand
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id") Integer id){
        String result=orderHystrixService.paymentInfo_Timeout(id);
        return result;
    }

    public String paymentInfo_TimeoutHandler(Integer id){
        return "线程池："+Thread.currentThread().getName()+"port:8015 系统繁忙或者出现错误，请重试！,id:"+id;
    }

    public String payment_Global_FallbackMethod(){
        return "线程池："+Thread.currentThread().getName()+"port:8015 Global 系统繁忙或者出现错误，请重试！";
    }

}
