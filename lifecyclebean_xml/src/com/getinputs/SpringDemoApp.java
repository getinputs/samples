package com.getinputs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Manager manager = context.getBean("manager", Manager.class);

		manager.getName();
		manager.getSalary();
		
		context.close();
		
		System.out.println("Context is closed hence bean is destroyed");
	}
}
