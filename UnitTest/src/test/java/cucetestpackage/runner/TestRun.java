package cucetestpackage.runner;

/**
 * Created by shepelevich on 12/9/2016.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report/nixreport", "json:target/cucumber.json"},
        features = "src/test/java/cucetestpackage/features",
        glue = "cucetestpackage.stepdefs",
        tags = {})


public class TestRun {
}
