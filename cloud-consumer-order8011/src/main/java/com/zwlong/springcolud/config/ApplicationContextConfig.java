package com.zwlong.springcolud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 龙振威
 * @Date 2020/8/31 21:20
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    //@LoadBalanced /*使用该注解赋予RestTemplate负载均衡能力 */
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
