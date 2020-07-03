package com.fyang.app.aop;

/**
 * @author fyang
 */
public class AopTestBean {
    private String str = "aopTestBean";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void test(){
        System.out.println(str);
    }
}
