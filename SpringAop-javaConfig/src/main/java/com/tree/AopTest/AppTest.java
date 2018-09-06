package com.tree.AopTest;

import com.tree.config.ApplicationConfig;
import com.tree.dao.IUserDao;
import com.tree.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试类
 * @author zhaoxj
 * @date 2018-09-06
 */
public class AppTest {

    /**
     *Spring AOP底层是使用cglib代理和jdk动态代理
     *
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        IUserDao userDao = ctx.getBean(IUserDao.class);
        userDao.getUserName();
    }
}
