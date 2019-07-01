package com.liuwq.controller;

import com.liuwq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/6/27 0027 下午 2:13
 * @version: V1.0
 */
@Controller
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl02")
    private UserService userService;

    public UserController() {
        System.out.println(">>>UserController...");
    }

    public String test() {
        return userService.test();
    }

}
