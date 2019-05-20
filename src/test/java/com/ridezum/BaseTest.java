package com.ridezum;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    protected WebDriver driver;


    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Lena/IdeaProjects/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://ridezum.com/");
        //driver.manage().window().maximize();

    }

    @After
    public void close() {
        driver.quit();
    }
}
