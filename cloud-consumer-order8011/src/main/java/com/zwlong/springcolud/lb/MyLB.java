package com.zwlong.springcolud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author 龙振威
 * @Date 2020/9/14 22:21
 */
@Component
public class MyLB implements LoadBalanced {


    private AtomicInteger atomicInteger=new AtomicInteger(0);

    public  final int getAndincrement(){
        int current;
        int next;
        do{
            current=this.atomicInteger.get();
            next=current>=2147483647 ? 0 : current+1;
        }while(!this.atomicInteger.compareAndSet(current,next));
        System.out.println("******* 第几次访问》 next : "+next);
        return next;
    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index=this.getAndincrement()%serviceInstances.size();
        return serviceInstances.get(index);
    }
}
