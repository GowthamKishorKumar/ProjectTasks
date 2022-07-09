package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty"},features="C:\\Users\\god\\eclipse-workspace\\MavenTasks\\Feautures\\Feature.feature",glue="C:\\Users\\god\\eclipse-workspace\\MavenTasks\\src\\test\\java\\com\\stepdefinition\\LoginStep.java")
public class TestRunner {
	
}
