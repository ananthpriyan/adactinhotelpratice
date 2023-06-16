package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( dryRun=!true,snippets = SnippetType.CAMELCASE,
                  features = "src\\test\\resources",glue= {"com.stepdefinitions"} ,monochrome = true ,
                      plugin = {"pretty","json:target/JSONReports/report.json1"},tags= "@Login2"
                      )


public class Runner {
	
	


}
