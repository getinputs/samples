package com.getinputs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DatabaseConfig databaseConfig = context.getBean("databaseConfig", DatabaseConfig.class);

		System.out.println("DB host : "+ databaseConfig.getHost());
		System.out.println("DB port : "+ databaseConfig.getPort());
		System.out.println("DB username : "+ databaseConfig.getUserName());
		System.out.println("DB password : "+ databaseConfig.getPassword());
				
		context.close();
	}
}
