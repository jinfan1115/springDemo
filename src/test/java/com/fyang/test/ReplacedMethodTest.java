package com.fyang.test;

import com.fyang.app.methodReplacer.TestChangeMethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReplacedMethodTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application-config.xml");
        TestChangeMethod cm = (TestChangeMethod) ac.getBean("testChangeMethod");
        cm.changeMethod();
    }
}
