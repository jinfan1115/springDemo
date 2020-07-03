package com.fyang.test;

import com.fyang.app.event.TestEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationConfig.xml");
        TestEvent testEvent = new TestEvent("hello","msg");
        applicationContext.publishEvent(testEvent);

    }
}
