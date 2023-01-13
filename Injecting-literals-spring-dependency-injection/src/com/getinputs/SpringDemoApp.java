package com.getinputs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Manager manager = (Manager) context.getBean("employee", Employee.class);
		
		System.out.println("Name of the manager is : "+manager.getName());
		
		System.out.println("Salary of the manager is : "+manager.getSalary());
		
		context.close();
	}
}
