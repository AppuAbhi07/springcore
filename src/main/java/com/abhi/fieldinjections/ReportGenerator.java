package com.abhi.fieldinjections;

import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {
	public void generateReport(String reportType) {
		System.out.println("Generating " + reportType + " report...");
	}
}
