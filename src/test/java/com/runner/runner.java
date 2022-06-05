package com.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(
features = {"."},glue= {"com.stepDefination"},
tags={"@updateResume"},format = { "pretty",
"json:target/cucumber.json" }, dryRun=false,plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html", "rerun:target/rerun.txt" })

public class runner {

	@AfterClass
	public static void setup()
	{
		
	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	Reporter.setSystemInfo("User Name", "AJ");
	Reporter.setSystemInfo("Application Name", "Test App ");
	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	Reporter.setSystemInfo("Environment", "Production");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}	
	

}
