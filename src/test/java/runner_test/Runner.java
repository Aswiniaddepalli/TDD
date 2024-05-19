package runner_test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="features",
glue="stepDefinition_task",
tags= "@SmokeTest",plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//plugin={"pretty","html:target/CucumberReports.html","json:target/CucumberReport/JSONReport.json"},
monochrome=true,dryRun=true)//dryRun( by default it is false set it to true) 
public class Runner extends AbstractTestNGCucumberTests {
	
}