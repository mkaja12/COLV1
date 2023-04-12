package com.COLeCommerceWebsite.utilities;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/UserIDValidationChrome.feature",
		glue     = {"com.AmazonLoginPage.stepDefinitions"},
		plugin   = {//"pretty", 
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun   = false,
		monochrome= true
		
			
		)


public class myRunner {

}
