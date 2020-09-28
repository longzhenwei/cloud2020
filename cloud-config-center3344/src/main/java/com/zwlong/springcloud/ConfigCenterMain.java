package com.zwlong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author 龙振威
 * @Date 2020/9/26 22:21
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigCenterMain {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain.class,args);
    }
}
