package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Get bean from Spring container
		Coach tennisCoach = context.getBean("thatSillyCoach",Coach.class);
		//Call a method from the bean
		System.out.println(tennisCoach.getDailyWorkout());
		//Close container
		context.close();
	}

}
