package com.abhi.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.abhi.scopes")
public class TaskTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TaskTest.class);

		// Prototype Bean: New instance for each request
		Task task1 = context.getBean(Task.class);
		Task task2 = context.getBean(Task.class);

		System.out.println("Are Task instances the same? " + (task1 == task2)); // false

		// Each Task is a unique instance
		System.out.println("Task 1: " + task1);
		System.out.println("Task 2: " + task2);
		
		System.out.println("Task 1: " + task1.hashCode());
		System.out.println("Task 2: " + task2.hashCode());
	}

}
