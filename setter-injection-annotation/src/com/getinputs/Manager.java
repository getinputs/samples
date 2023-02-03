package com.getinputs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("manager")
public class Manager implements Employee{

	private Address address;
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public void getWorkType() {
		System.out.println("Manage all the employees");
	}
	
	@Override
	public void getSalary() {
		System.out.println("Salary is Rs.50000");
	}

	@Override
	public void getAddress() {
		address.getAddress();
	}
}
