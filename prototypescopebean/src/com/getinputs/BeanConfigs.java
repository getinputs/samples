package com.getinputs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BeanConfigs {
	
	@Bean
	@Scope("prototype")
	public Manager manager() {
		return new Manager();
	}
}
