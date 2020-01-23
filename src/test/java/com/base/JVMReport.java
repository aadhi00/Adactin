package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void reportGen(String jsonFile) {
		File loc = new File(System.getProperty("user.dir") + "/src/test/resources/reports/");
		Configuration con = new Configuration(loc, "Adactin Hotel Booking");
		con.addClassifications("Browser Name: ", "Google Chrome");
		con.addClassifications("Sprint: ", "25");
		con.addClassifications("OS: ", "Ubuntu 18.04.3 LTS");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles, con);
		builder.generateReports();
	}

}
