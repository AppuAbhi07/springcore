package com.abhi.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.abhi.scopes") // Scans components in the package
public class LoggerServiceUsingClassLevelTest {

	
	public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(LoggerServiceUsingClassLevelTest.class);

        // Singleton Bean: Shared instance
        LoggerServiceUsingClassLevel logger1 = context.getBean(LoggerServiceUsingClassLevel.class);
        LoggerServiceUsingClassLevel logger2 = context.getBean(LoggerServiceUsingClassLevel.class);
        
        System.out.println(logger1.hashCode());
        System.out.println(logger2.hashCode());


        System.out.println("Are LoggerService instances the same? " + (logger1 == logger2)); // true

        // Use the LoggerService
        logger1.log("Application started");
        logger2.log("Singleton scope verified");
    }
	
}
