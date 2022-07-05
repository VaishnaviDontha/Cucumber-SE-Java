package StepDefinations;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class loginDemoWithData {

//    WebDriver driver;
//    @Given("User must navigate to the respective Browser")
//    public void user_must_navigate_to_the_respective_browser() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//    }
//    @And("User navigates to Login Page")
//    public void user_navigates_to_login_page() {
//
//        driver.get("https://opensource-demo.orangehrmlive.com/");
//        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
//
//    }
//    @When("User enters valid {string} and {string}")
//    public void user_enters_valid_and(String username, String password) {
//
//        driver.findElement(By.cssSelector("#txtUsername")).sendKeys(username);
//        driver.findElement(By.cssSelector("#txtPassword")).sendKeys(password);
//
//    }
//
//    @And("User clicks on Login button")
//    public void user_clicks_on_login_button() {
//
//        driver.findElement(By.cssSelector("#btnLogin")).click();
//
//    }
//
//    @Then("User is navigated to the homepage or views {string}")
//    public void user_is_navigated_to_the_homepage_or_views(String expectedErrorMessage) {
//
//        String actualErrorMessage = driver.findElement(By.id("spanMessage")).getText();
//        System.out.println("Error Message :" + actualErrorMessage);
//        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
//
//        //close the browser
//        driver.close();
//        driver.quit();
//    }
}
