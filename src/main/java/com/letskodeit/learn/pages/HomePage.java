package com.letskodeit.learn.pages;/*
 *Vinay Creation
 *Date of Creation
 */

import com.letskodeit.learn.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

//    //list of elements and their locations
//    By practiceLink = By.linkText("Practice");
//    By loginLink = By.linkText("Login");
//    By signUpbtn = By.linkText("Sign Up");

    @FindBy(linkText = "Practice")
    WebElement _parcticeLink;
    @FindBy(linkText = "Login")
    WebElement _loginLink;
    @FindBy(linkText = "Sign Up")
    WebElement _signUpBtn;

    //methods performing actions on elements

    public void clickOnPracticeLink () {
        Reporter.log("Clicking on Pactice Link " + _parcticeLink.toString() + "<br>");
        clickOnElement(_parcticeLink);
        log.info("Clicking on Pactice Link " + _parcticeLink.toString());
    }

    public void clickOnLoginLink() {
        Reporter.log("Clicking on Login Link : " + _loginLink.toString() + "<br>");
        clickOnElement(_loginLink);
        log.info("Clicking on Login Link : " + _loginLink.toString());
    }

    public void clickOnSignUpBtn() {
        Reporter.log("Clicking on Sign button : " + _signUpBtn.toString() + "<br>");
        clickOnElement(_parcticeLink);
        log.info("Clicking on Sign Up Button : " + _signUpBtn.toString());

    }
}
