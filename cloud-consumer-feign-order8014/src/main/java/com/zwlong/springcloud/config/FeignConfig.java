package com.zwlong.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author 龙振威
 * @Date 2020/9/16 22:34
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return  Logger.Level.FULL;
    }
}
