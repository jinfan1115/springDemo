package com.fyang.app.beanDefinition;

import com.fyang.model.Person;
import com.fyang.pojo.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author fyang
 */

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    @SuppressWarnings("rawtypes")
    protected Class getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder bean) {
        String userName = element.getAttribute("userName");
        String email = element.getAttribute("email");
        if (StringUtils.hasText(userName)) {
            bean.addPropertyValue("userName", userName);
        }
        if (StringUtils.hasText(email)){
            bean.addPropertyValue("email", email);
        }

    }
}
