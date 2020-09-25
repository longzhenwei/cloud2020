package com.zwlong.springcloud.service;

import com.zwlong.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 龙振威
 * @Date 2020/8/28 22:45
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
