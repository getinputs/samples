package com.getinputs;

import org.springframework.beans.factory.BeanNameAware;

public class Manager implements BeanNameAware {
	
	String name;
	
	int salary;
	
	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is : "+beanName);			
	}

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
	
	public void init() {
		System.out.println("init method is called after properties are set");
		System.out.println("Name of manager is : "+getName());
		System.out.println("Salary of manager is : "+getSalary());
	}
	
	public void destroy() {
		System.out.println("destroy method is called just before bean gets destroyed");
	}
}
