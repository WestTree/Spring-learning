package com.tree.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @program: Spring-learning
 * @description: 定义切面
 * @author: zhaoxj
 * @create: 2018-09-06 22:56
 **/
@Aspect
@Component
public class AspectConfig {

    /***
     * 定义切点，切点需要一个方法作为载体
     */
    @Pointcut("execution(* com.tree.dao.*.*(..))")
    public void pointCutMethod(){

    }

    @Before("com.tree.config.AspectConfig.pointCutMethod()")
    public void beforeMethod(){
        System.out.println("This is before advise");
    }

    @After("com.tree.config.AspectConfig.pointCutMethod()")
    public void afterMethod(){
        System.out.println("This is after advise");
    }
}
