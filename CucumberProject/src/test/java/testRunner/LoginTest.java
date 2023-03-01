package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/FeatureFiles"}
		, glue = {"stepDefination"}
		, plugin = {"pretty"}
		, monochrome = true
	    , dryRun = false
		)


public class LoginTest {

}