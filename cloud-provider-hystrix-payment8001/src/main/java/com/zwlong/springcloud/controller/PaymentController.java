package com.zwlong.springcloud.controller;

import com.zwlong.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 龙振威
 * @Date 2020/9/17 21:46
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        return paymentService.paymentInfo_OK(id);
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id") Integer id){
        return paymentService.paymentInfo_Timeout(id);
    }

    /**
     * 服务熔断方法
     * @param id
     * @return
     */
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker_fallback(@PathVariable("id")Integer id){
        return paymentService.paymentCircuitBreaker(id);
    }
}
