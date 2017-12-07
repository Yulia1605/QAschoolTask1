
import Pages.MainPage;
import org.junit.Test;


public class PromUaTest extends BrowserSetting {


@Test

    public void logInAndBuyInFireFox() throws InterruptedException {
    openInFireFox();
    mainPage = new MainPage(driver);
    loginPage= mainPage.clickProfileLink();
    loginPage.typeEmail(userEmail);
    loginPage.typePassword(userPassword);
    userPage=loginPage.pressSubmitButton();
    userPage.userNameCheck();
    orderPage=userPage.clickNavigationLink();
    orderPage.searchProduct();
    orderPage.clickBuyButton();
    orderPage.clickDeleteIcon();
    orderPage.backToBuy();
    }

    @Test

    public void logInAndBuyInChrome() throws InterruptedException {
        openInChrome();
        mainPage = new MainPage(driver);
        loginPage= mainPage.clickProfileLink();
        loginPage.typeEmail(userEmail);
        loginPage.typePassword(userPassword);
        userPage=loginPage.pressSubmitButton();
        userPage.userNameCheck();
        orderPage=userPage.clickNavigationLink();
        orderPage.searchProduct();
        orderPage.clickBuyButton();
        orderPage.clickDeleteIcon();
        orderPage.backToBuy();

    }



}
