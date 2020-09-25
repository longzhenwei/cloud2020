package com.zwlong.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

/**
 * @Author 龙振威
 * @Date 2020/9/6 22:05
 */
@Controller
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/zk")
    @ResponseBody
    public String paymentzk(){
        return "springcloud with zookeeper:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }

}
