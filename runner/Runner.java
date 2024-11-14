package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/main/java/features"},
		glue={"stepdefinition"},
		publish=true,
		monochrome=true,
		tags= ( "@assignments" )
		)

public class Runner extends AbstractTestNGCucumberTests {

}