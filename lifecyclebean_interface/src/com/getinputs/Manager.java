package com.getinputs;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Manager implements InitializingBean, DisposableBean{
	
	String name;
	
	int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method is called after properties are set");
		System.out.println("Name of manager is : "+getName());
		System.out.println("Salary of manager is : "+getSalary());	
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method is called just before bean gets destroyed");	
	}
}
