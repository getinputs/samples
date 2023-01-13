package com.getinputs;

public class Accountant implements Employee{

    Address address;
	
	public Accountant(Address address) {
		this.address = address;
	}
	
	@Override
	public void getWorkType() {
		System.out.println("Does all the accounting work");
	}
	
	@Override
	public void getSalary() {
		System.out.println("Rs.400000");
	}
	
	@Override
	public void getAddressType() {
		address.getAddressType();
	}
}
