package com.ridezum;

import org.junit.Test;

public class BecomeDriver extends BaseTest {
    protected HomePage homePage;
    protected DriverPage driverPage;


    @Test
    public void becomeDriverTest(){
        homePage = new HomePage(driver);

       driverPage = homePage.clickDriverButton();




    }





}
