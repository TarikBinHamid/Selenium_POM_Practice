import browser.Browser;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    public void testCalculator(){
        Browser browser=new Browser();
        browser
                .openBrowser()
                .clickLinkFromFinancialCalculator("Mortgage Calculator");
    }
}
