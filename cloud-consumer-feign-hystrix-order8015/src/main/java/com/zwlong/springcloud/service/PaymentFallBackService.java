package com.zwlong.springcloud.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author 龙振威
 * @Date 2020/9/19 16:13
 */
@Component
public class PaymentFallBackService implements OrderHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "fallBack paymentInfo_OK";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "fallBack paymentInfo_Timeout";
    }
}
