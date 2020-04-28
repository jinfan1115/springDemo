package com.fyang.test;

import com.fyang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserBeanDefinitionTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:user-config.xml");
        User user = (User) ac.getBean("testBean");
        System.out.println(user.getUserName()+":::"+user.getEmail());
    }
}
