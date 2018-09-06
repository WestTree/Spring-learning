package com.tree.dao;

import org.springframework.stereotype.Component;

/**
 * @program: Spring-learning
 * @description: 创建UserDao
 * @author: zhaoxj
 * @create: 2018-09-06 22:14
 **/
@Component
public class UserDao {

    public void getUserName(){
        System.out.println("Aop Xml...");
    }
}
