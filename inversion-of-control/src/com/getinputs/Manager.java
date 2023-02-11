package com.getinputs;

public class Manager implements Employee{

	@Override
	public void getWorkType() {
		System.out.println("Manage all the employees");
	}
	
	@Override
	public void getSalary() {
		System.out.println("Rs.500000");
	}
}
