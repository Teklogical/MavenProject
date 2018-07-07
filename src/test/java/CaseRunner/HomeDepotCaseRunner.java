package CaseRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:/Users/84128/git/MavenProject/src/test/resources/CaseTest.Feature/" }, glue = {
				"CaseRunner" }, plugin = { "pretty", "html:target/cucumber-reports" }

)

public class HomeDepotCaseRunner {

}
