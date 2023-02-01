package com.getinputs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee manager = context.getBean("manager", Employee.class);
		manager.getWorkType();
		manager.getSalary();
		
		Employee accountant = context.getBean("accountant", Employee.class);

		accountant.getWorkType();
		accountant.getSalary();
		
		context.close();
	}
}
