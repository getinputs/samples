package com.getinputs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee employee = context.getBean("employee", Employee.class);

		employee.getWorkType();
		employee.getSalary();
		
		context.close();
	}
}
