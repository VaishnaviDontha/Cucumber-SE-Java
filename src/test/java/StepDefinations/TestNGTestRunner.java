package StepDefinations;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
                 features = "src/test/resources/Features/test.feature", 
                 glue = "StepDefinations")
public class TestNGTestRunner {
    
}
