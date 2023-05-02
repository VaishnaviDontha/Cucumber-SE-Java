package StepDefinations;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class loginDemo {

    WebDriver driver;

    @Given("browser is open")
    public void browser_is_open() {

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    @And("User is on the login page")
    public void user_is_on_the_login_page() {

        driver.get("hhttps://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");

    }
    @When("User enters valid username and password and clicks on Login button")
    public void user_enters_valid_username_and_password_and_clicks_on_login_button() {

        driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
        driver.findElement(By.cssSelector("#btnLogin")).click();

    }
    @Then("User must be able to navigate to the home page")
    public void user_must_be_able_to_navigate_to_the_home_page() {

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
//        driver.findElement(By.cssSelector("#welcome")).click();
        driver.getPageSource().contains("Logout");

        driver.quit();
    }
}
