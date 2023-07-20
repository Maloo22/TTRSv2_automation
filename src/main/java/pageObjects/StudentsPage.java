package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StudentsPage extends BaseMain {

    public StudentsPage (WebDriver driver) {

        super(driver);
    }

    //locators
    public String studentsPageInHeader = "//app-header/div[1]/div[2]/div[1]/a[8]";
    public String addStudentsDrpdwn = "//body/app-root[1]/app-user-layout[1]/div[1]/div[1]/div[1]/app-students[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]";
    public String addManuallyOption = "//body/app-root[1]/app-user-layout[1]/div[1]/div[1]/div[1]/app-students[1]/p-menu[1]/div[1]/ul[1]/li[2]";

    public String firstNameField = "//input[@id='firstName']";
    public String secondNameField = "//input[@id='lastName']";
    public String addStudentsbtn = "//body/p-dynamicdialog[1]/div[1]/div[1]/div[2]/app-add-students-dialog[1]/form[1]/blockable-div[1]/div[1]/div[1]/div[3]/button[2]";

    

    //values
    public String firstName = "Andrew";
    public String secondName = "EFIMOVICH";




    public void openStudentsPage () {

        driver.findElement(By.xpath(studentsPageInHeader)).click();

        WebDriverWait waitForMessage = new WebDriverWait(driver, Duration.ofSeconds(20));
        waitForMessage.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(addStudentsDrpdwn)));
    }

    public void openAddStudentsManually () {

        driver.findElement(By.xpath(addStudentsDrpdwn)).click();
        driver.findElement(By.xpath(addManuallyOption)).click();
    }
    public void fillFirstAndSecondNameInAddStudentsWindow () {

        driver.findElement(By.xpath(firstNameField)).sendKeys(firstName);
        driver.findElement(By.xpath(secondNameField)).sendKeys(secondName);
        driver.findElement(By.xpath(addStudentsbtn)).click();
    }






}
