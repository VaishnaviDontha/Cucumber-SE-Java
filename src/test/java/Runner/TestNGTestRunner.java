package StepDefinations;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/Features/loginWithData.feature",
        glue = {"StepDefinations"},
        monochrome = true,
        plugin = {"pretty", "json:src/Reports/cucumber.json"}
)
public class TestNGTestRunner {
    
}
