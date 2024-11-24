package com.abhi.scopes;

import org.springframework.stereotype.Service;

@Service
public class LoggerServiceUsingClassLevel {

	public void log(String message) {
		System.out.println("LOG: " + message);
	}

}
