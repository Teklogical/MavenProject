package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\jcruk\\Downloads\\MavenProject-master\\MavenProject-master\\src\\test\\resources\\features" }, 
        glue = {"C:\\Users\\jcruk\\Downloads\\MavenProject-master" }, 
        plugin = { "pretty", "html:target/cucumber-reports" },
		tags = {"@Openapp,@VerifyHomePage,@Myaccount,@Searchitem1,@Searchitem2,@Storefinder"}
)

public class TestRunner_HomeDepot {

}

