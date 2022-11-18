package com.extentUtil;

import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentUtil
{
	public static ExtentReports report;
	public static ExtentTest test;
	
	public static void extentReport()
	{
		report=new ExtentReports();
		File path=new File("EndToEnd.html");
		ExtentSparkReporter sparkReport=new ExtentSparkReporter("./SpartkReports/"+path);
		report.attachReporter(sparkReport);
		test=report.createTest("Test");
	}
	public static void flushMethodd()
	{
		report.flush();
	}
}
