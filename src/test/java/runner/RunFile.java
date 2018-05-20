package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/features/CreateLead.feature"},glue="stepdefinition",monochrome=true,tags={"@smoke"})


public class RunFile {

}
