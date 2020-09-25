package com.zwlong.springcolud;

import com.zwlong.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author 龙振威
 * @Date 2020/8/31 21:09
 * 使用自定义ribbon加载
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain8011 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain8011.class,args);
    }
}
