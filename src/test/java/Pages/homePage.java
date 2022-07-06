package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class homePage {
    
    protected WebDriver driver;

    private By numberOfItems = By.xpath("//table[@class='quickLaungeContainer']/tbody/tr/td");
    private By txtPassword = By.cssSelector("#txtPassword");
    private By login = By.cssSelector("#btnLogin");
    private By errorMessage = By.cssSelector("#spanMessage");

    public homePage(WebDriver dr){

        this.driver = dr;
        
    }

    public void quickLaunchEntries(){
        int entries =  driver.findElements(numberOfItems).size();
        Assert.assertEquals(6, entries);
        
    }

    public void enterPassword(String password) {
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(login).click();
    }

    public String errorMessage(){
        String error = driver.findElement(errorMessage).getText();
        return error;

    }

//    Or below one single function

    public void loginValidUser(String username, String password){

        // driver.findElement(txtUsername).sendKeys(username);
        // driver.findElement(txtPassword).sendKeys(password);
        // driver.findElement(login).click();
    }
}
