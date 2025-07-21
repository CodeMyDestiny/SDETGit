
package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@smoke and @regression and not @perf", features = {
		"src/test/resources/featurestags" }, glue = {
				"stepdefinitions" }, plugin = { "pretty", "html:target/htmlreport.html" }, monochrome = true)
public class CucumberTestRunnerForTags extends AbstractTestNGCucumberTests {

}
