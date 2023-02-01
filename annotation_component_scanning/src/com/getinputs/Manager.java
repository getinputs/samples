package com.getinputs;

import org.springframework.stereotype.Component;

@Component("manager")
public class Manager implements Employee{

	@Override
	public void getWorkType() {
		System.out.println("Manage all the employees");
	}
	
	@Override
	public void getSalary() {
		System.out.println("Rs.50000");
	}
}
