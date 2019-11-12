package com.fyang.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fyang.model.Person;

public class SpringTest {
	@Test
	public void test1() {
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("classpath:application-config.xml");
		Person person = appcontext.getBean("person", Person.class);
		System.out.println(person.getName());
		
		
		
	}

}
