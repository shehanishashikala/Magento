package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features", // Path to your feature files
        glue = "StepDefinitions", // Package containing step definitions
        plugin = {
                "pretty", // Prints the Gherkin steps in the console
                "html:target/cucumber-reports/cucumber.html", // Generates an HTML report
                "json:target/cucumber-reports/cucumber.json", // Generates a JSON report
                "junit:target/cucumber-reports/cucumber.xml" // Generates a JUnit XML report
        },
        monochrome = true, // Makes console output more readable
        dryRun = false// Checks if all steps have step definitions (true = no execution)
)
public class TestRunner {
}
