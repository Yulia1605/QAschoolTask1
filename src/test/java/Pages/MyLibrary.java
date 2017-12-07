package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyLibrary {
    public WebDriver driver;
    public MyLibrary(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement search(By locator){
        return driver.findElement(locator);}

    public void type(String info,By locator) {
        WebElement login = search(locator);
        login.click();
        login.clear();
        login.sendKeys(info);
    }

}
