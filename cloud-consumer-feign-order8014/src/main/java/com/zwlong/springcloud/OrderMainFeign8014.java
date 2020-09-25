package com.zwlong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author 龙振威
 * @Date 2020/9/15 22:54
 */
@SpringBootApplication
@EnableFeignClients
public class OrderMainFeign8014 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainFeign8014.class,args);
    }
}
