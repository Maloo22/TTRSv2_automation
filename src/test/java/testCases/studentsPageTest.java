package testCases;

import org.testng.annotations.Test;

public class studentsPageTest extends BaseTest {



    @Test
    public  void openStudentsPage () {

        loginPage.openTTRS2WebPage();
        loginPage.enterEmailAndPassword();
        loginPage.clickSignIn();
        studentsPage.openStudentsPage();

    }

    @Test
    public  void addNewStudentManually () {

        loginPage.openTTRS2WebPage();
        loginPage.enterEmailAndPassword();
        loginPage.clickSignIn();
        studentsPage.openStudentsPage();
        studentsPage.openAddStudentsManually();
        studentsPage.fillFirstAndSecondNameInAddStudentsWindow();

    }




}


