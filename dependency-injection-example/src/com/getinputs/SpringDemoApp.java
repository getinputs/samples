package com.getinputs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Manager manager = context.getBean("manager", Manager.class);

		System.out.println("Manager's address is : "+ manager.getManagersAddress());
		
		context.close();
	}
}
