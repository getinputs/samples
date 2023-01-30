package com.getinputs;

public class Manager {
	
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
	
	public void init() {
		System.out.println("init method is called after properties are set");
		System.out.println("Name of manager is : "+getName());
		System.out.println("Salary of manager is : "+getSalary());
	}
	
	public void destroy() {
		System.out.println("destroy method is called just before bean gets destroyed");
	}
}
