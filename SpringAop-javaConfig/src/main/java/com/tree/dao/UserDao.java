package com.tree.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao implements IUserDao{

    @Override
    public void getUserName(){
        System.out.println("Aop javaConfig...");
    }
}
