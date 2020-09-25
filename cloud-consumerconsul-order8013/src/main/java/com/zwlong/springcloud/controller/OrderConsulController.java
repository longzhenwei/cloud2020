package com.zwlong.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author 龙振威
 * @Date 2020/9/11 22:48
 */
@RestController
@Slf4j
public class OrderConsulController {

    private static final  String PAYMENT_URL="http://consul-provider-payment/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String getConsul(){
        return restTemplate.getForObject(PAYMENT_URL+"payment/consul",String.class);
    }
}
