package com.fyang.app;

import com.fyang.model.Person;

public abstract class GetBeanTest {

    public void showMe(){
        this.getBean().showMe();
    }

    public abstract Person getBean();
}
