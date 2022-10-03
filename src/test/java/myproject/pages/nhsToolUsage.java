package myproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class nhsToolUsage {

    protected WebDriver driver;

    By next_btn = By.id("next-button");
    By england_label = By.id("label-england");
    By radio_btn_no = By.id("label-no");
    By radio_btn_yes = By.id("label-yes");
    By day_of_birth = By.id("dob-day");
    By month_of_birth = By.id("dob-month");
    By year_of_birth = By.id("dob-year");
    By textOfFinalResult = By.xpath("//*[@id=\"result-heading\"]/span[2]");

    public nhsToolUsage(WebDriver driver){
        this.driver = driver;
    }

    public void acceptCookies(){
        if( driver.findElement(By.id("nhsuk-cookie-banner__link_accept_analytics")).isDisplayed()){
            System.out.println("Element is Visible");
            driver.findElement(By.id("nhsuk-cookie-banner__link_accept_analytics")).click();
        }else{
            System.out.println("Element is InVisible");
        }
    }

    public void enterCompleteDetails(String day, String month, String year){
        driver.findElement(next_btn).click();
        driver.findElement(england_label).click();
        driver.findElement(next_btn).click();
        driver.findElement(radio_btn_no).click();
        driver.findElement(next_btn).click();
        driver.findElement(england_label).click();
        driver.findElement(next_btn).click();

        driver.findElement(day_of_birth).sendKeys(day);
        driver.findElement(month_of_birth).sendKeys(month);
        driver.findElement(year_of_birth).sendKeys(year);

        driver.findElement(next_btn).click();
        driver.findElement(radio_btn_no).click();
        driver.findElement(next_btn).click();
        driver.findElement(radio_btn_no).click();
        driver.findElement(next_btn).click();
        driver.findElement(radio_btn_no).click();
        driver.findElement(next_btn).click();
        driver.findElement(radio_btn_no).click();
        driver.findElement(next_btn).click();
        driver.findElement(radio_btn_no).click();
        driver.findElement(next_btn).click();
        driver.findElement(radio_btn_no).click();
        driver.findElement(next_btn).click();
        driver.findElement(radio_btn_no).click();
        driver.findElement(next_btn).click();
        driver.findElement(radio_btn_no).click();
        driver.findElement(next_btn).click();
        driver.findElement(radio_btn_no).click();
        driver.findElement(next_btn).click();
    }

    public void assertFinalResult(){
        String resultText = driver.findElement(textOfFinalResult).getText();
        System.out.println(resultText);
        assertEquals(resultText, "You could get help to pay for your NHS costs");
    }
}
