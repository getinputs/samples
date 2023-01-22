package com.getinputs;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestScopeBean {

    static private int counter = 1;
	
	public RequestScopeBean() {
		counter = counter + 1;
	}
	
	public int getCounter() {
		return counter;
	}
}
