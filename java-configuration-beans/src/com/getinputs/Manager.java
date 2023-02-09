package com.getinputs;

public class Manager {
	
	String name;
	int salary;
	
	Address address;
	
	Manager(Address address) {
		this.address = address;
	}

	public String getName() {
		return "Suraj";
	}

	public int getSalary() {
		return 50000;
	}

	public String getAddress() {
		return address.getAddress();
	}
}
