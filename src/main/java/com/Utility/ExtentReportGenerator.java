package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	public static ExtentReports extent;
	public static ExtentReports getReport() {
		
		String path="C:\\Users\\Omsai\\Documents\\java automation\\Batch_12_Framework\\Reports";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation test report");
		reporter.config().setReportName("test batch 12 report");
		reporter.config().setTheme(Theme.DARK);
		
	    extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("project name","test batch project");
		extent.setSystemInfo("os","windows");
		extent.setSystemInfo("tool","selenium webdriver");
		extent.setSystemInfo("Qa","Nitin");
		return extent;
	
	}

}
