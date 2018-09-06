package com.tree.test;

import com.tree.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: Spring-learning
 * @description: 测试类
 * @author: zhaoxj
 * @create: 2018-09-06 22:42
 **/
public class AppTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao dao = ctx.getBean(UserDao.class);
        dao.getUserName();
    }
}
