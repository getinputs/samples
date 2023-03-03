package com.getinputs;

public class Manager {

	Address managersAddress;
	
	public Manager(Address managersAddress) {
		this.managersAddress = managersAddress;
	}

	public String getManagersAddress() {
		return managersAddress.getAddress();
	}
}
