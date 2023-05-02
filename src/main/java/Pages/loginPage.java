package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginPage {

    protected WebDriver driver;

    private By txtUsername = By.cssSelector("#txtUsername");
    private By txtPassword = By.cssSelector("#txtPassword");
    private By login = By.cssSelector("#btnLogin");
    private By errorMessage = By.cssSelector("#spanMessage");

    public loginPage(WebDriver dr){

        this.driver = dr;
        Assert.assertEquals("OrangeHRM",driver.getTitle());
    }


    public void enterUsername(String username){
        driver.findElement(txtUsername).sendKeys(username);
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

        driver.findElement(txtUsername).sendKeys(username);
        driver.findElement(txtPassword).sendKeys(password);
        driver.findElement(login).click();
    }
}
