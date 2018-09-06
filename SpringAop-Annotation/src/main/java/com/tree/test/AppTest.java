package com.tree.test;

import com.tree.dao.IUserDao;
import com.tree.dao.impl.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: Spring-learning
 * @description: 测试类
 * @author: zhaoxj
 * @create: 2018-09-06 23:07
 **/
public class AppTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao dao = ctx.getBean(IUserDao.class);
        dao.getUserName();
    }
}
