package com.fyang.app;

import com.fyang.model.User;

public abstract class GetBeanTest {

    public void showMe(){
        this.getBean().showMe();
    }

    public abstract User getBean();
}
