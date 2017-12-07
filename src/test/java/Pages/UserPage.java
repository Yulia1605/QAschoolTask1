package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.CoreMatchers.containsString;


public class UserPage extends MyLibrary {
    public UserPage(WebDriver driver) {
        super(driver);
    }

    By navigateToPurchaseLocator=By.xpath("//a[@class='b-customer-ability__link'][contains(text(),'Перейти к покупкам')]");
    By userNameLocator =By.xpath("//p[@class='h-inline-block h-bold h-layout-hidden']");

  public void userNameCheck(){
      Assert.assertThat(search(userNameLocator).getText(),containsString("Yulia"));
      System.out.println("User name is correct");

  }
//фамилию сравнить не получается так как в html коде- перенос <br> после имени


    public OrderPage clickNavigationLink (){
        search(navigateToPurchaseLocator).click();
        return new OrderPage(driver);

    }
}
