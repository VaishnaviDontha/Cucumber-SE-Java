package StepDefinations;


import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
                 glue = {"StepDefinations"},
                 monochrome = true,
        plugin = {"pretty", "html:Reports/report.html", "json:Reports/JSONReports/reports.json", "junit:Reports/JUnitReport/report.xml"},
        tags = "")
public class TestRunner {


}
