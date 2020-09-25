package com.zwlong.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author 龙振威
 * @Date 2020/8/28 22:43
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan("com.zwlong.springcloud.mapper")
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }
}
