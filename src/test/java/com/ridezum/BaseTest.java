package com.ridezum;

import helper.UserDriver;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;
    protected UserDriver userDriver;


    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Lena/IdeaProjects/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://ridezum.com/");
        //driver.manage().window().maximize();
        userDriver =new UserDriver();


    }

//    @After
//    public void close() {
//        driver.quit();
//    }
}