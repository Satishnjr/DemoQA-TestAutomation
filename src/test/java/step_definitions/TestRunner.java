package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/Navigation.feature:7", plugin = {
		"pretty", "html:target/cucumber-html-report", "json:cucumber.json" }, tags = {})
public class TestRunner {
 
}
