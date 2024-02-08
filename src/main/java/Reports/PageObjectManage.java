package Reports;

import org.openqa.selenium.WebDriver;
import Path.Locator;

public class PageObjectManage {
    public static WebDriver driver;

    public Locator accountspage;

    public PageObjectManage(WebDriver driver) {
        this.driver = driver;
    }

    public Locator getHomePage() {
        accountspage = new Locator(driver);

        return accountspage;
    }
}
