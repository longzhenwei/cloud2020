package com.zwlong.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 龙振威
 * @Date 2020/11/2 23:08
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configinfo")
    public String getConfigInfo(){
        return "serverPort:"+this.serverPort+"\t\n configInfo:"+this.configInfo;
    }
}
