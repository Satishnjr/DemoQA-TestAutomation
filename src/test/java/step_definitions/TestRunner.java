package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
<<<<<<< HEAD
@CucumberOptions(features = "classpath:features/RegistrationForm.feature", plugin = {
		"pretty", "html:target/cucumber-html-report", "json:cucumber.json" }, tags = {})
=======
@CucumberOptions(features = "classpath:features", plugin = { "pretty",
		"html:target/cucumber-html-report", "json:cucumber.json" }, tags = {})
>>>>>>> 0b017ef029d72c18bcc2acf9d9c86da7121d2f62
public class TestRunner {

}
