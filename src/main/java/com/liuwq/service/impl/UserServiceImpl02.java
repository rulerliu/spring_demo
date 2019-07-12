package com.liuwq.service.impl;

import com.liuwq.service.PayService;
import com.liuwq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/7/1 0001 下午 4:46
 * @version: V1.0
 */
@Service
public class UserServiceImpl02 implements UserService {
    @Autowired
    private PayService payService;

    @Override
    public String test() {
        return "UserServiceImpl02" + payService.test();
    }
}
