package com.zwlong.springcolud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author 龙振威
 * @Date 2020/9/14 22:19
 */
public interface LoadBalanced {
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
