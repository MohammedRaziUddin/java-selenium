package BDD.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/BDD/Features",
        glue = "StepDefination", strict = false)
public class TestRunnerFile {
}

