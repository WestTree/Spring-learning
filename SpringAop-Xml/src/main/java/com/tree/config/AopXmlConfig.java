package com.tree.config;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @program: Spring-learning
 * @description: 基于XML的AOP配置
 * @author: zhaoxj
 * @create: 2018-09-06 22:27
 **/
@Component
public class AopXmlConfig {


    public void beforeMethod(){
        System.out.println("This is before advise");
    }

    public void afterMethod(){
        System.out.println("This is after advise");
    }
}
