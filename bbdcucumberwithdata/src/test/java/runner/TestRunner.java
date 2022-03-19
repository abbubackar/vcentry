package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Feature/" ,
glue="stepdefinition",
plugin = {"pretty","html:target/cucunber-reports/cucumber.html",
		"junit:target/cucunber-reports/cucumber.xml",
		"json:target/cucunber-reports/cucumber.json"})
public class TestRunner {

}
