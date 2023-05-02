package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageWithPageFactory {

    protected WebDriver dr;

    public loginPageWithPageFactory(WebDriver driver){

        this.dr = driver;
        PageFactory.initElements(driver, loginPageWithPageFactory.class);

    }

    @FindBy(id = "txtUsername")
    WebElement txtUsername;

    @FindBy(id = "txtPassword")
    WebElement txtPassword;

    @FindBy(id = "btnLogin")
    WebElement login;


    public void enterUserName(String username){
        txtUsername.sendKeys(username);
    }

    public void enterPassword(String password){
        txtPassword.sendKeys(password);
    }

    public void clickLogin(){
        login.click();
    }
}
