package com.getinputs;

import org.springframework.stereotype.Component;

@Component
public class Manager {
	
	String name;
	
	int salary;

	public String getName() {
		return "Suraj";
	}

	public int getSalary() {
		return 50000;
	}
}
