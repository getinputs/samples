package com.getinputs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Manager manager = context.getBean("manager", Manager.class);

		System.out.println("Manager's name is : "+manager.getName());
		System.out.println("Manager's salary is : "+manager.getSalary());
		
		context.close();
	}
}
