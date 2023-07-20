package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjects.LoginPage;
import pageObjects.StudentsPage;

import java.time.Duration;


public class BaseTest {



    public ChromeDriver driver;
    LoginPage loginPage;
    StudentsPage studentsPage;





    @BeforeMethod
    public void startAndFullScreen () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrew\\Documents\\GitHub\\TTRSv2_automation\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
        studentsPage = new StudentsPage(driver);



        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
    }

    @AfterMethod
    public void closeBrowser()  {

        driver.quit();

    }
}