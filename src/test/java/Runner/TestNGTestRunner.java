package Runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/Features/loginWithData.feature",
        glue = {"src/test/java/StepDefinations"},
        monochrome = true,
        plugin = {"pretty", "json:src/Reports/cucumber.json"}
)
public class TestNGTestRunner {
    
}
