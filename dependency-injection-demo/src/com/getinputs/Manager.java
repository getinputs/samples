package com.getinputs;

public class Manager implements Employee{

	Address employeeAddress;
		
	@Override
	public void getWorkType() {
		System.out.println("Manage all the employees");
	}
	
	@Override
	public void getSalary() {
		System.out.println("Rs.500000");
	}
	
	@Override
	public void getAddressType() {
		employeeAddress.getAddressType();
	}
	
	public void setEmployeeAddress(Address address) {
		employeeAddress = address;
	}
}
