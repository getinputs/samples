package com.getinputs;

import org.springframework.stereotype.Component;

@Component("accountant")
public class Accountant implements Employee{

	@Override
	public void getWorkType() {
		System.out.println("Does all the accounting work");
	}
	
	@Override
	public void getSalary() {
		System.out.println("Rs.40000");
	}
}
