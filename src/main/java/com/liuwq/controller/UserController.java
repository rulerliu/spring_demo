package com.liuwq.controller;

import com.liuwq.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/6/27 0027 下午 2:13
 * @version: V1.0
 */
@Controller
public class UserController implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean, ApplicationContextAware {

    @Autowired
    @Qualifier("userServiceImpl02")
    private UserService userService;

    public UserController() {
        System.out.println(">>>UserController...");
    }

    public String test() {
        return userService.test();
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(">>>setBeanName:" + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(">>>setBeanFactory:" + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext:" + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(">>>afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(">>>destroy");
    }

}
