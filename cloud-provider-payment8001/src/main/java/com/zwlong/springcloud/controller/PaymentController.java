package com.zwlong.springcloud.controller;

import com.zwlong.springcloud.entities.CommonResult;
import com.zwlong.springcloud.entities.Payment;
import com.zwlong.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author 龙振威
 * @Date 2020/8/28 22:47
 */
@RestController
@Slf4j
public class PaymentController {


    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody  Payment payment)
    {
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);

        if(result > 0)
        {
            return new CommonResult(200,"插入数据库成功，端口："+serverPort,result);
        }else{
            return new CommonResult(444,"插入数据库失败，端口："+serverPort,null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id)
    {
        Payment payment = paymentService.getPaymentById(id);
        if(payment != null)
        {
            return new CommonResult(200,"查询成功，端口："+serverPort,payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: "+id+"，端口："+serverPort,null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<String> services=discoveryClient.getServices();
        for (String service:services   ) {
            log.info("******element:"+service);
        }
        List<ServiceInstance> serviceInstances=discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance:serviceInstances) {
            log.info(instance.getInstanceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);//睡眠3秒
        }catch (Exception e){
            e.printStackTrace();
        }
        return serverPort;
    }

    public static void main(String[] args) {
        ZonedDateTime zon=ZonedDateTime.now();
        System.out.println(zon);

    }
}
