package StepDefinations;

import Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class loginDemoWithPOM {

   public WebDriver driver ;


   loginPage login ;
   @Given("User must navigate to the respective Browser")
   public void user_must_navigate_to_the_respective_browser() {
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();

       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   }
   @And("User navigates to Login Page")
   public void user_navigates_to_login_page() {

       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       Assert.assertEquals(driver.getTitle(), "OrangeHRM");

   }
   @When("User enters valid {string} and {string}")
   public void user_enters_valid_and(String username, String password) {

       login = new loginPage(driver);
       login.enterUsername(username);
       login.enterPassword(password);

   }

   @And("User clicks on Login button")
   public void user_clicks_on_login_button() {


       login.clickLogin();

   }

   @Then("User is navigated to the homepage or views {string}")
   public void user_is_navigated_to_the_homepage_or_views(String expectedErrorMessage) {

       String actualErrorMessage = login.errorMessage();
       System.out.println("Error Message :" + actualErrorMessage);
       Assert.assertEquals(actualErrorMessage,expectedErrorMessage);

       //close the browser
       driver.close();
       driver.quit();
   }
}
