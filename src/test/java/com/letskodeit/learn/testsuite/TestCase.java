package com.letskodeit.learn.testsuite;/*
 *Vinay Creation
 *Date of Creation
 */

import com.letskodeit.learn.loadproperty.LoadProperty;
import com.letskodeit.learn.pages.HomePage;
import com.letskodeit.learn.pages.LoginPage;
import com.letskodeit.learn.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase extends TestBase {
    HomePage homePage;
    LoginPage loginPage;


    @BeforeMethod(groups = {"Regression","Smoke","Sanity"})
    public void SetUp(){
        homePage = new HomePage();
        loginPage = new LoginPage();

    }

    //TestCases
    @Test(groups = {"Regression","Sanity"})
    public void navigateSuccessfullyToPracticePage() {
        //click on Practice link
        homePage.clickOnPracticeLink();

    }

    @Test (groups = {"Regression","Smoke"})
    public void navigateSuccessfullyToLoginPage() {
        //click on Login link
        homePage.clickOnLoginLink();

    }

    @Test (groups = {"Regression"})
    public void navigateSuccessfullyToSignupPage() {
        //click on SignUp button
        homePage.clickOnSignUpBtn();

    }

    @Test (groups = {"Regression"})
    public void userShouldSelectHondaElementFromDropDownMenu() throws InterruptedException {
        //click on Practice link
        homePage.clickOnPracticeLink();

    }
}

