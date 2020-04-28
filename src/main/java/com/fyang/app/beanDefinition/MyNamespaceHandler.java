package com.fyang.app.beanDefinition;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author fyang
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
