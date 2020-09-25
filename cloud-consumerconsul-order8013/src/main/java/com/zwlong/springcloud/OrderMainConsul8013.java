package com.zwlong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author 龙振威
 * @Date 2020/9/11 22:47
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMainConsul8013 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainConsul8013.class,args);
    }
}
