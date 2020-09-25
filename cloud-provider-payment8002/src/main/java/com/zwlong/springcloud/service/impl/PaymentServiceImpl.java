package com.zwlong.springcloud.service.impl;

import com.zwlong.springcloud.entities.Payment;
import com.zwlong.springcloud.mapper.PaymentMapper;
import com.zwlong.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author 龙振威
 * @Date 2020/8/28 22:46
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
