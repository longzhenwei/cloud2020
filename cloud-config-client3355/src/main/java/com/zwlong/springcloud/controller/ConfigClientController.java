package com.zwlong.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 龙振威
 * @Date 2020/9/26 22:14
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configindo;

    @GetMapping("/configinfo")
    public String getConfiginfo()
    {
        return this.configindo;
    }
}
