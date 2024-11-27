package com.abhi.byname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.abhi.byname")
public class Test {


	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
		CheckFamily s =context.getBean(CheckFamily.class);
		s.check();
		 
	}
	
	
}
