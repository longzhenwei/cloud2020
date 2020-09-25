package com.zwlong.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author 龙振威
 * @Date 2020/9/8 21:59
 */
@Controller
@Slf4j
public class OrderZkController {

    @Value("${server.port}")
    private String serverPort;


    @Resource
    private RestTemplate restTemplate;

    public static  final String INVOKE_URL="http://cloud-provider-payment";

    @GetMapping("/consumer/payment/zk")
    @ResponseBody
    public String getZk(){
        String result=restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
        return result;
    }


}
