package com.abhi.fieldinjections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    @Autowired // Field Injection
    private ReportGenerator reportGenerator;

    public void createReport(String reportType) {
        reportGenerator.generateReport(reportType);
    }
}