package com.getinputs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Address getAddressInstance() {
		return new Address();		
	}
	
	@Bean("manager")
	public Manager getManagerInstance() {
		return new Manager(getAddressInstance());	
	}
}
