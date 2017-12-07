package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class OrderPage extends MyLibrary {


By searchFieldLocator=By.xpath("//input[@class='x-search__field']");
By searchButtonLocator=By.xpath("//button[@class='x-search__button']");
// id(ниже) часто меняется.
By buyButtonLocator=By.xpath("//a[@id='shopping-cart-add-element-text-542738112']");
By deleteIconLocator=By.xpath("//span[@class='x-shc-item__control']");
By backToBuyLocator=By.xpath("//span[@class='x-button x-button_theme_purple']");


    public OrderPage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct(){
       search(searchFieldLocator).sendKeys("macbook", Keys.ENTER);
       search(searchButtonLocator).click();
    }
    public  void clickBuyButton(){
        search(buyButtonLocator).click();
    }

   public void clickDeleteIcon (){
      search(deleteIconLocator).click();

    }
    public  void backToBuy(){
        search(backToBuyLocator).click();
    }

}
