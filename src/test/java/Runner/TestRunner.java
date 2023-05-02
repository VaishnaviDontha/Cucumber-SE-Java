package StepDefinations;


import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/loginWithData.feature",
        glue = {"StepDefinations"},
        monochrome = true,
        plugin = {"pretty", "json:src/Reports/cucumber.json"}
        //, "json:Reports/JSONReports/reports.json", "junit:Reports/JUnitReport/report.xml"}
        )
public class TestRunner {


}
