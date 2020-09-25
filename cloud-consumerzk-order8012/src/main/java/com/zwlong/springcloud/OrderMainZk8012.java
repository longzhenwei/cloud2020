package com.zwlong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 龙振威
 * @Date 2020/9/8 21:55
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMainZk8012 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMainZk8012.class,args);
    }

}
