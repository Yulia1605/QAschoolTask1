package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends MyLibrary{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By emailInputLocator=By.xpath("//input[@id='phone_email']");
    By passwordInputLocator=By.xpath("//input[@id='password']");
    By submitButtonLocator=By.xpath("//button[@id='submit_login_button']");

    public void typeEmail(String email) {
        type(email, emailInputLocator);
    }
    public void typePassword(String password) {
        type(password, passwordInputLocator);
    }
    public UserPage pressSubmitButton(){
        search(submitButtonLocator).click();
        return new UserPage(driver);
    }

    }



