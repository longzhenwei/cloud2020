package com.zwlong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author 龙振威
 * @Date 2020/9/17 22:37
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
public class OrderMainFeignHystrix8015 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainFeignHystrix8015.class,args);
    }
}
