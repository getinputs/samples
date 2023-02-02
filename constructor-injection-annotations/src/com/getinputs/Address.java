package com.getinputs;

import org.springframework.stereotype.Component;

@Component("address")
public class Address {

	public void getAddress() {
		System.out.println("Manager's address is : Civil lines , Delhi");
	}
}
