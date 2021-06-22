package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeClass {

	public static void main(String[] args) {
		// Reading config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Retrieve bean from Spring container
		Coach anotherCoach = context.getBean("tennisCoach", Coach.class);
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		System.out.println(anotherCoach == theCoach);
	}

}
