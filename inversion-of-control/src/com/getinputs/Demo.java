package com.getinputs;

public class Demo {

	public static void main(String[] args) {
		
		Employee manager = new Manager();
		manager.getWorkType();
		manager.getSalary();
		
		Employee accountant = new Accountant();
		accountant.getWorkType();
		accountant.getSalary();
	}
}
