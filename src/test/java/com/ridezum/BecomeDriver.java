package com.ridezum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class BecomeDriver extends BaseTest {

    protected HomePage homePage;
    protected DriverPage driverPage;

    @Test
    public void becomeDriverTest() {
        homePage = new HomePage(driver);
        driverPage = homePage.clickDriverButton();

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        driverPage.inputFirstName(userDriver.getFirstName());
        driverPage.inputLastName(userDriver.getLastName());
        driverPage.inputEmail(userDriver.getEmail());
        driverPage.inputPhone(userDriver.getPhone());
        driverPage.inputAreaField();
        driverPage.selectArea();
        driverPage.inputZipCode(userDriver.getZipCode());
        driverPage.inputRefferalCode(userDriver.getRefferalCode());
        // next command wll be switch out from iframe

        driver.switchTo().defaultContent();

        driverPage.clickSubmitButton();
        String res =driverPage.getErrorMessage();
        Assert.assertEquals("Please enter a valid email address",res);

    }
}


