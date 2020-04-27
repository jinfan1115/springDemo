package com.fyang.test;

import com.fyang.app.GetBeanTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookupMethodTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application-config.xml");
        GetBeanTest gbt = (GetBeanTest) ac.getBean("getBeanTest");
        gbt.showMe();
    }
}
