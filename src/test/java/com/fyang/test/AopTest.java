package com.fyang.test;

import com.fyang.app.aop.AopTestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aspectConfig.xml");
        AopTestBean aopTestBean = (AopTestBean) applicationContext.getBean("test");
        aopTestBean.test();
    }
}
