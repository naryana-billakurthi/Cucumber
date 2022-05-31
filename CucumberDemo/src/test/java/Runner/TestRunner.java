package Runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features/login.feature"},
		glue = {"stepdefs", "login"},
		dryRun =false,
		tags = "@Regression",	
		plugin= {"json:target/CucumberReports/cucumber.json","pretty", "html:target/Cucumber.html"}
		//
		)
public class TestRunner {
	
	

}
