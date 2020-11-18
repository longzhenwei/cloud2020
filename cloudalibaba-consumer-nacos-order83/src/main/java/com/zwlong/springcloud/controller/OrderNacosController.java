package com.zwlong.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author 龙振威
 * @Date 2020/11/18 22:39
 */
@RestController
@Slf4j
public class OrderNacosController {

    @Value("${server-url.nacos-user-service}")
    private String URL;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/nacos/{id}")
    public String id(@PathVariable("id") Long id){
        String result=restTemplate.getForObject(URL+"/payment/nacos/"+id,String.class);
        return result;
    }
}
