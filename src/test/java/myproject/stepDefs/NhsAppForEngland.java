package myproject.stepDefs;

import base.BaseScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myproject.pages.nhsToolUsage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class NhsAppForEngland extends BaseScenario {

    WebDriver driver = getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    nhsToolUsage toolUsage = new nhsToolUsage(driver);

    @And("^I am a citizen of the UK and on NHS checker tool app$")
    public void i_am_a_citizen_of_the_UK_and_on_NHS_checker_tool_app() throws Throwable {
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(getSiteBaseUrl() + "/check-for-help-paying-nhs-costs/start");

        toolUsage.acceptCookies();
    }

    @When("^I put my circumstances into the Checker tool$")
    public void i_put_my_circumstances_into_the_Checker_tool() throws Throwable {
        toolUsage.enterCompleteDetails("20","06","1980");
    }

    @Then("^I should get a result of whether I will get help or not$")
    public void i_should_get_a_result_of_whether_I_will_get_help_or_not() throws Throwable {
        toolUsage.assertFinalResult();
    }
}
