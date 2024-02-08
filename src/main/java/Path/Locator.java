package Path;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator {

@Getter
WebDriver driver;


    By Number_input_box = By.xpath("//input[@id='number']");
    By Continue_Button = By.xpath("//button[@type='submit']");

    By Pin_Box = By.xpath("//input[@id='PIN']");

    By Account_button = By.xpath("(//p[normalize-space()='Accounts'])[1]");
    By Account_Option = By.xpath("//a[@class='mr-1']");

    By Balance_Box = By.xpath("//h2[@class='px-5 py-2 rounded-md max-w-max flex gap-1 bg-success-100 text-0']");

    By Money_In = By.xpath("//button[normalize-space()='Money in']");

    By Money_Out = By.xpath("//button[normalize-space()='Money out']");

    By Cross_Button = By.xpath("//div[@class='flex items-center justify-between']//button[@type='button']");

    By Note_Box = By.xpath("//textarea[@id='notes']");

    By Amount_required_error = By.xpath("//p[normalize-space()='Amount field required']");

    By Amount_Box = By.xpath(" //input[@id='cashAmount']");
    By Cancel_button = By.xpath("//button[normalize-space()='Cancel']");


    public Locator(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement Number_input_box() {
        return driver.findElement(Number_input_box);

    }

    public WebElement Continue_button() {
        return driver.findElement(Continue_Button);
    }

    public WebElement Pin_Box() {
        return driver.findElement(Pin_Box);
    }

    public WebElement Account_button() {
        return driver.findElement(Account_button);
    }

    public WebElement Account_Option() {
        return driver.findElement(Account_Option);
    }

    public WebElement Balance_Box() {
        return driver.findElement(Balance_Box);
    }

    public WebElement Money_In() {
        return driver.findElement(Money_In);
    }

    public WebElement Money_Out() {
        return driver.findElement(Money_Out);
    }

    public WebElement Cross_Button() {
        return driver.findElement(Cross_Button);
    }

    public WebElement Note_Box() {
        return driver.findElement(Note_Box);
    }

    public WebElement Amount_required_error() {
        return driver.findElement(Amount_required_error);

    }
    public WebElement Amount_Box() {
        return driver.findElement(Amount_Box);
    }
    public WebElement Cancel_button() {
        return driver.findElement(Cancel_button);}



}
