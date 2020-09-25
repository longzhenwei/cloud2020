package com.zwlong.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zwlong.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 龙振威
 * @Date 2020/8/28 22:44
 */
public interface PaymentMapper extends BaseMapper<Payment> {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}