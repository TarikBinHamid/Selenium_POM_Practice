package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

import java.time.Duration;

public class Browser {

    private static WebDriver driver;
    String browserName="Chrome";
    String url="https://www.calculator.net/";


    public HomePage openBrowser(){

        if(browserName.equalsIgnoreCase("Chrome")){
            driver=new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            driver=new FirefoxDriver();
        }else {
            driver=new EdgeDriver();
        }
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return PageFactory.initElements(driver,HomePage.class);



        }
    public static WebDriver getDriver(){
        return driver;


    }
}
