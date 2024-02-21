package pages;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {

    @FindBy(xpath = "//*[@id='hl1']/li/a") private List<WebElement> financialCalculatorLinks;
    WebDriver driver= Browser.getDriver();
    public void clickLinkFromFinancialCalculator(String linkName){
        for (WebElement element:financialCalculatorLinks) {
            if (element.getText().equalsIgnoreCase(linkName)){
                element.click();
                break;
            }

        }

    }

}
