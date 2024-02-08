package StepDef;

import com.google.common.base.CharMatcher;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import Path.Locator;
import utilis.TestContextSetup;

public class AccountSteps {
    private TestContextSetup testContextSetup;
    private WebDriver driver;
    private Locator accountspage;

    public AccountSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.driver = testContextSetup.driver;
        this.accountspage = testContextSetup.pageObjectManager.getHomePage();
    }
   private int wait = 3000;


    @And("Check that the balance should be Zero")
    public void checkThatTheBalanceShouldBeZero() throws InterruptedException {
        Thread.sleep(1000);
        String Text = accountspage.Balance_Box().getText();
        String Balance = CharMatcher.digit().retainFrom(Text);
        Assert.assertEquals(Balance, "0");

    }

    @Given("Click on the Accounts sidebar")
    public void clickOnTheAccountsSidebar() throws InterruptedException {
        Thread.sleep(1000);
        accountspage.Account_button().click();
    }


    @Then("Verify the visibility of the Accounts option on the top-left corner")
    public void verifyTheVisibilityOfTheAccountsOptionOnTheTopLeftCorner() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(accountspage.Account_Option().isDisplayed());
    }

    @When("Click on the Cash in button")
    public void clickOnTheCashInButton() throws InterruptedException {
        Thread.sleep(1000);
        accountspage.Money_In().click();
    }

    @Then("Check that Cash In is visible on the sidebar modal")
    public void checkThatCashInIsVisibleOnTheSidebarModal() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(accountspage.Money_In().isDisplayed());
        Thread.sleep(1000);
        accountspage.Cross_Button().click();
    }

    @When("Click on the Cash Out button")
    public void clickOnTheCashOutButton() throws InterruptedException {

        Thread.sleep(1000);
        accountspage.Money_Out().click();
    }

    @Then("Check that Cash Out is visible on the sidebar modal")
    public void checkThatCashOutIsVisibleOnTheSidebarModal() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(accountspage.Money_Out().isDisplayed());
        Thread.sleep(1000);
        accountspage.Cross_Button().click();
    }


    @Given("Enter a registered number")
    public void enterARegisteredNumber() throws InterruptedException {
        Thread.sleep(1000);
        accountspage.Number_input_box().sendKeys("01752717572");

    }

    @And("Click on continue button")
    public void clickOnContinueButton() throws InterruptedException {
        Thread.sleep(1000);
        accountspage.Continue_button().click();
    }

    @And("Enter pin number")
    public void enterPinNumber() throws InterruptedException {
        Thread.sleep(1000);
        accountspage.Pin_Box().sendKeys("12345");
    }

    @And("Click on Go to dashboard")
    public void clickOnGoToDashboard() throws InterruptedException {
        Thread.sleep(1000);
        accountspage.Continue_button().click();
    }


    @And("Enter Note")
    public void enterNote() throws InterruptedException {
        Thread.sleep(1000);
        accountspage.Note_Box().sendKeys("test");
    }

    @And("Click on Add button")
    public void clickOnAddButton() throws InterruptedException {
        Thread.sleep(1000);
        accountspage.Continue_button().click();
    }

    @Then("Check that Amount field required message should appear")
    public void checkThatAmountFieldRequiredMessageShouldAppear() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(accountspage.Amount_required_error().isDisplayed());

    }

    @And("Enter Positive amount {int}")
    public void enterPositiveAmount(int arg0) throws InterruptedException {
        Thread.sleep(2000);
        accountspage.Amount_Box().sendKeys(Integer.toString(arg0));
    }


    @Then("Verify the total Balance is {double}")
    public void verifyTheTotalBalanceIs(Number arg0) throws InterruptedException {
        if(arg0 instanceof Integer) {
            Thread.sleep(1000);
            String Text = accountspage.Balance_Box().getText();
            String Balance = CharMatcher.digit().retainFrom(Text);
            Assert.assertEquals(arg0.intValue(), Integer.parseInt(Balance));
        } else if (arg0 instanceof Double){
            Thread.sleep(1000);
            String[] Text = accountspage.Balance_Box().getText().split(" ");
            double Amount = Double.parseDouble(Text[1]);
            Assert.assertEquals(arg0.doubleValue(),Amount,0.001);

        }

    }

    @And("Enter decimal amount {double}")
    public void enterDecimalAmount(double arg0) throws InterruptedException {
        Thread.sleep(1000);
        accountspage.Amount_Box().sendKeys(Double.toString(arg0));
    }


    @And("Click on Cancel button")
    public void clickOnCancelButton() throws InterruptedException {
        Thread.sleep(1000);
        accountspage.Cancel_button().click();

    }

    @And("Click on Cross button on the upper corner")
    public void clickOnCrossButtonOnTheUpperCorner() throws InterruptedException {
        Thread.sleep(1000);
        accountspage.Cross_Button().click();
    }
}
