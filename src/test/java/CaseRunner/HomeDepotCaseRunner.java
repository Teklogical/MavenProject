package CaseRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:/Users/Administrator/git/MavenProject/src/test/resources" }, 
        glue = {"CaseRunner" }, 
        plugin = { "pretty", "html:target/cucumber-reports" },
		tags = {"@Openapp,@VerifyHomePage,@Myaccount,@Searchitem1,@Searchitem2,@Storefinder"}
)

public class HomeDepotCaseRunner {

}
