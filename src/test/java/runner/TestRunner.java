package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", 
		glue = { "stepCodes" }, 
		tags = {"@loginTest"}, 
		dryRun = false, 
									
		monochrome = true, 
		strict = false, 
		format = {"pretty",
		        "html:target/cucumber-reports/cucumber-pretty",
		        "json:target/cucumber-reports/CucumberTestReport.json",
		        "rerun:target/cucumber-reports/rerun.txt"
		},
		plugin = "json:target/cucumber-reports/CucumberTestReport.json")
//classpath:Features
public class TestRunner {
	
	

}
