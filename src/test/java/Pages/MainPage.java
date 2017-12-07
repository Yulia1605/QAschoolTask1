package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage extends MyLibrary {
    public MainPage(WebDriver driver) {
        super(driver);
    }

      By profileLinkLocator=By.xpath("//a[@data-qaid='auth_element']");



        public LoginPage clickProfileLink(){
           search(profileLinkLocator).click();
            return new LoginPage(driver);}

    }
