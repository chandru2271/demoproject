package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features =  "./src/test/resources/featurefile/datatabe.feature",

glue = "stepdefinition",
publish = true,
monochrome = true,
dryRun=true,
plugin= {"pretty","html:target/output.html","junit:target/output.xml","json:target/output.json"},

//tags=("@smoke or @sanity")
)
public class TestRunnerDemo {

}
