package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/FeatureWithTags", // Path to your feature files
            glue = {"StepDefinitions"}, // Package containing step definitions
            monochrome = true,
            tags = "@RegressionTest" // Executes scenarios with this tag
    )
    public class TestRunner_RunWithSingleTag {
    }

