package com.zwlong.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 龙振威
 * @Date 2020/11/30 22:30
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        return "------------------testA";
    }
    @GetMapping("/testB")
    public String testB(){
        return "------------------testB";
    }

}
