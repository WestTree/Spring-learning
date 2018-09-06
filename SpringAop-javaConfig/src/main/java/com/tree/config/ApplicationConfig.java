package com.tree.config;

import com.tree.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhaoxj
 * @create 2018-09-06
 */
@Configuration
@ComponentScan("com.tree")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ApplicationConfig {

   /* @Bean(name="userDao")
    public UserDao entitlement() {
        return new UserDao();
    }*/
}
