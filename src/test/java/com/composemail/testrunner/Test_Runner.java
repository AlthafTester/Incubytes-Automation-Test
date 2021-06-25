package com.composemail.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.composemail.baseclass.Base_Class;
import com.composemail.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//composemail//featurefile", glue = "com.composemail.stepdefinition",
plugin = "com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html")


public class Test_Runner {

	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Throwable {

		String browser = File_Reader_Manager.getInstance().getInstancrCR().getBrowser();
		driver = Base_Class.browserlaunch(browser);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
