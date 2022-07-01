package StepDefinations;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SearchTests {

    WebDriver driver;
    @Given("Launch Browser")
    public void launch_browser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(), "Google");

    }

    @And("User is on google search page")
    public void user_is_on_google_search_page() {

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");

    }

    @When("User enters text in search bar")
    public void user_enters_text_in_search_bar() {

        driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Selenium");
    }

    @And("User hits enter")
    public void user_hits_enter() {

        driver.findElement(By.cssSelector("input[title='Search']")).sendKeys(" Automation", Keys.ENTER);

    }

    @Then("User must be navigated to respective search results page")
    public void user_must_be_navigated_to_respective_search_results_page() {

        //Assert.assertEquals(driver.getTitle(), "Selenium Automation - Google Search");
        driver.quit();

    }


}
