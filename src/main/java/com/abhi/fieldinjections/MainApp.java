package com.abhi.fieldinjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.abhi.fieldinjections") // Enable Component Scanning
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainApp.class);

        ReportService reportService = context.getBean(ReportService.class);
        reportService.createReport("Sales");
    }
}
