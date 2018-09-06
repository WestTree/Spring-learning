package com.tree.dao.impl;

import com.tree.dao.IUserDao;
import org.springframework.stereotype.Component;

/**
 * @program: Spring-learning
 * @description: 创建UserDao
 * @author: zhaoxj
 * @create: 2018-09-06 23:05
 **/
@Component
public class UserDao implements IUserDao {
    @Override
    public void getUserName() {
        System.out.println("This is Annotation Aop ...");
    }
}
