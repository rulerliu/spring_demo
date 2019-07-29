package com.liuwq.service.impl;

import com.liuwq.service.ServiceA;
import com.liuwq.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/7/1 0001 下午 4:46
 * @version: V1.0
 */
// 这里面不指定beanid默认是payServiceImpl，也可使用接口payService做为beanid
@Service
public class ServiceBImpl implements ServiceB {

    @Autowired
    private ServiceA serviceA;

    @Override
    public String test() {
        return "ServiceBImpl";
    }
}
