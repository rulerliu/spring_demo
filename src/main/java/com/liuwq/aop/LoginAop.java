package com.liuwq.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAop {

    /**
     * @Pointcut 定义切入点
     */
//    @Pointcut(value = "execution (* com.liuwq.service..*.*(..))")
    @Pointcut("execution (* com.liuwq.service..*.*(..))")
    public void loginAop() {

    }

    /**
     * 环绕通知
     *
     * @param joinPoint
     */
    @Around("loginAop()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object proceed = joinPoint.proceed();// 执行目标方案
        System.out.println(">>>>环绕通知之后执行...>>>>>>");
        return proceed;
        // 思考如何回滚呢？ 抛出异常
    }

    /**
     * 前置通知
     *
     * @param joinPoint
     */
    @Before("loginAop()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println(">>>>>>>前置通知<<<<<<<<<<< ");
    }

    /**
     * 后置通知
     */
    @After("loginAop()")
    public void doAfter(JoinPoint joinPoint) {
        System.out.println(">>>>>>>>后置通知<<<<<<<<<");
    }

    /**
     * 运行通知
     */
    @AfterReturning("loginAop()")
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println("运行通知执行.....");
    }

    /**
     * 异常通知
     *
     * @param joinPoint
     */
    @AfterThrowing("loginAop()")
    public void afterThrowing(JoinPoint joinPoint) {
        System.out.println(">>>>>异常通知");
    }

}
