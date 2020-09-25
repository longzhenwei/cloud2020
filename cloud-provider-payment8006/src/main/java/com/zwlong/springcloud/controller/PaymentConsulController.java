package com.zwlong.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author 龙振威
 * @Date 2020/9/9 22:04
 */
@RestController
@Slf4j
public class PaymentConsulController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/consul")
    public String getConsul(){
        return "springcloud with consul:"+serverPort +" "+ UUID.randomUUID();
    }
}
