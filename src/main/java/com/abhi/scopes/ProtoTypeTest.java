package com.abhi.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProtoTypeTest {
	
	   public static void main(String[] args) {
	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	        // Prototype Bean: New instance for each request
	        Transaction transaction1 = context.getBean(Transaction.class);
	        Transaction transaction2 = context.getBean(Transaction.class);
	        Transaction transaction3 = context.getBean(Transaction.class);
	        Transaction transaction4 = context.getBean(Transaction.class);
	        
	        
	        System.out.println("transaction1" + transaction1.hashCode());
	        System.out.println("transaction2" + transaction2.hashCode());
	        System.out.println("transaction3" + transaction3.hashCode());
	        System.out.println("transaction3" + transaction4.hashCode());
	        
	        System.out.println("Are the instances the same? " + (transaction1 == transaction2)); // false

	        // Each Transaction is a unique instance
	        System.out.println("Transaction 1: " + transaction1);
	        System.out.println("Transaction 2: " + transaction2);
	    }

}
