package com.letskodeit.learn.testbase;/*
 *Vinay Creation
 *Date of Creation
 */

import com.letskodeit.learn.basepage.BasePage;
import com.letskodeit.learn.browserselector.BrowserSelector;
import com.letskodeit.learn.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String browser = loadProperty.getProperty("browser");
    String baseUrl = loadProperty.getProperty("baseUrl");

    //opens Browser
    @BeforeMethod(groups = {"Regression","Smoke","Sanity"})
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    //closes Browser
    @AfterMethod(groups = {"Regression","Smoke","Sanity"})
    public void closeBrowser() {
        driver.quit();
    }
}

