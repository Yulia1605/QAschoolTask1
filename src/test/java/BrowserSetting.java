import Pages.LoginPage;
import Pages.MainPage;
import Pages.OrderPage;
import Pages.UserPage;
import org.junit.After;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSetting {
    protected String userEmail="Yuliaqa@online.ua";
    protected String userPassword="Yulia123";
    protected WebDriver driver;
    public MainPage mainPage;
    public LoginPage loginPage;
    public UserPage userPage;
    public   OrderPage orderPage;



  public  void openInFireFox(){
         driver = new FirefoxDriver();
        driver.get("https://prom.ua/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public WebElement search(By locator){
        return driver.findElement(locator);}

        public void openInChrome(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\QAschoolTask\\src\\Recources\\chromedriver.exe");
             driver = new ChromeDriver();
            driver.get("https://prom.ua/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

    @After
     public void tearDown(){
       driver.close();}


    }





