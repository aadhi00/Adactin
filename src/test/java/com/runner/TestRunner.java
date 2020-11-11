package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;
import com.base.LibGlobal;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/Login.feature", glue = { "com.stepdefinition" },
plugin = {"json:src/test/resources/reports/Report.json" ,"rerun:src/test/resources/failed/failed.txt"}
	,			dryRun = false, strict = true, monochrome = true)
public class TestRunner extends LibGlobal{

	@AfterClass
	public static void finalStep() {
		JVMReport.reportGen(System.getProperty("user.dir") + "/src/test/resources/reports/Report.json");
	}
	
}
