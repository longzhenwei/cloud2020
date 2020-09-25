package com.zwlong.springcloud.controller;

import com.zwlong.springcloud.entities.CommonResult;
import com.zwlong.springcloud.entities.Payment;
import com.zwlong.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 龙振威
 * @Date 2020/9/15 22:55
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String getPaymentById(){
        return paymentFeignService.paymentFeignTimeout();
    }

}
