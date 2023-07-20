package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BaseMain {

    public LoginPage(WebDriver driver) {

        super(driver);
    }

    //locators
    public String WebsiteURL = "https://ttrs-ui-w.azurewebsites.net/";
    public String logInBtn = "//button[@id='btn.LogIn']";
    //button[@id='btn.LogIn']
    public String emailField = "//input[@id='Input_Email']";
    public String passwordField = "//input[@id='Input_Password']";

    public String activityDropdowns = "//body/app-root[1]/app-user-layout[1]/div[1]/div[1]/div[1]/app-activity-feed[1]/div[1]/div[1]/div[2]";

    //values
    public String emailValue = "ccg3";
    public String passwordValue = "Excellent5";



    public void openTTRS2WebPage(){

        driver.get(WebsiteURL);
    }

    public void enterEmailAndPassword(){

        WebDriverWait waitForMessage = new WebDriverWait(driver, Duration.ofSeconds(100));
        waitForMessage.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(logInBtn)));

        driver.findElement(By.xpath(emailField)).sendKeys(emailValue);
        driver.findElement(By.xpath(passwordField)).sendKeys(passwordValue);

        waitForMessage.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(activityDropdowns)));

    }

    public void clickSignIn(){
        driver.findElement(By.xpath(logInBtn)).click();
    }


}
