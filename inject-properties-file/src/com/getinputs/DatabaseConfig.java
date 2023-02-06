package com.getinputs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConfig {
	
	@Value("${db.host}")
	String host;
	
	@Value("${db.port}")
	String port;
	
	@Value("${db.username}")
	String userName;
	
	@Value("${db.password}")
	String password;

	public String getHost() {
		return host;
	}

	public String getPort() {
		return port;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
}
