package com.getinputs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee employee1 = context.getBean("employee", Employee.class);
		System.out.println("Employee instance 1 : "+employee1);
		
		Employee employee2 = context.getBean("employee", Employee.class);
		System.out.println("Employee instance 2 : "+employee2);
		
		context.close();
	}
}
