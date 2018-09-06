package com.tree.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @program: Spring-learning
 * @description: 创建AOP配置
 * @author: zhaoxj
 * @create: 2018-09-06 19:50
 **/
@Aspect
@Component
public class AspectConfig {

    @Pointcut("execution(* com.tree.dao.*.*(..))")
    public void pointCut(){

    }

    @Before("com.tree.config.AspectConfig.pointCut()")
    public void beforeMethod(){
        System.out.println("This is Before Advise");
    }

    @After("com.tree.config.AspectConfig.pointCut()")
    public void afterMethod(){
        System.out.println("This is After Advise");
    }
}
