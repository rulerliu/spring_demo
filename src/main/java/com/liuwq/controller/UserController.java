package com.liuwq.controller;

import com.liuwq.service.PayService;
import com.liuwq.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/6/27 0027 下午 2:13
 * @version: V1.0
 */
@Controller
public class UserController implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean, ApplicationContextAware {

    @Autowired
//    @Qualifier("userServiceImpl02")
    private UserService userService;

    @Autowired
    private PayService payService;

    public UserController() {
        System.out.println(">>>UserController...Construct");
    }

    /**
     * 该方法在构造方法之后，初始化方法之前，执行
     */
    @PostConstruct
    public void postConstruct() {
        System.out.println(">>>>UserController postConstruct...");
    }

    public String test() {
        return ">>>test>>>:" +  payService.test() + userService.test();
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

    /**
     * 初始化方法
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(">>>afterPropertiesSet...init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(">>>destroy");
    }

}
