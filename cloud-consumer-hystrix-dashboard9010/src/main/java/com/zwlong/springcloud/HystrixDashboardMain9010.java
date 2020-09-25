package com.zwlong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author 龙振威
 * @Date 2020/9/20 15:30
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9010 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9010.class,args);
    }

}
