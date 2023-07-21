package testCases;

import org.testng.annotations.Test;


public class loginPageTest extends BaseTest{



    @Test
    public void logInInToTTRS2asAdmin () {

        loginPage.openTTRS2WebPage();
        loginPage.enterEmailAndPassword();
        loginPage.clickSignIn();

    }





}

