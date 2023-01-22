package com.getinputs;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionScopeBean {

	static private int counter = 1;
	
	public SessionScopeBean() {
		counter = counter + 1;
	}
	
	public int getCounter() {
		return counter;
	}
}
