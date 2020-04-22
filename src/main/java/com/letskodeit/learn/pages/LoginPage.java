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

public class LoginPage extends Utility {
    public static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    //list of elements and their locations
   // By logInToLetsKodeIt = By.cssSelector("h1.text-center");
    @FindBy(css = "h1.text-center")
    WebElement _loginToLetsKodeIt;

    //methods performing actions on elements
    public void verifyTextLogInToLetsKodeIt(String textMesg) {
        Reporter.log("Verify text log in to Lets Kode it  : " + textMesg + "Message " + _loginToLetsKodeIt.toString() + "<br>");
        verifyTextAssertMethod(_loginToLetsKodeIt, textMesg);
        log.info("Verify text log in to Lets Kode it  : " + textMesg + "Message " + _loginToLetsKodeIt.toString());
    }

}
