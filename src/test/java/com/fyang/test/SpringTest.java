package com.fyang.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fyang.model.Person;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringTest {
	@Test
	public void test1() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("application-config.xml"));
//		ApplicationContext appcontext = new ClassPathXmlApplicationContext("classpath:application-config.xml");
//		Person person = appcontext.getBean("person", Person.class);
        Person person = (Person) bf.getBean("person");
		System.out.println(person.getName());
		
		
		
	}

}
