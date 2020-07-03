package com.fyang.app.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class TestListener implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if (applicationEvent instanceof TestEvent){
            TestEvent testEvent = (TestEvent) applicationEvent;
            testEvent.print();
        }
    }
}
