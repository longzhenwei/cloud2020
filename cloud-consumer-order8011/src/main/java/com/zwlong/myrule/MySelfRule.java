package com.zwlong.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 龙振威
 * @Date 2020/9/13 10:29
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule mtRule(){
        return new RandomRule(); //随机
    }
}
