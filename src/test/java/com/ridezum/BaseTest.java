package com.ridezum;

import helper.UserApplicant;
import helper.UserDriver;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;
    protected UserDriver userDriver;
    protected CareerPage careerPage;
    protected JobPage jobPage;
    protected ApplyForJobPage applyForJobPage;
    protected ApplicationPage applicationPage;
    protected UserApplicant userApplicant;


    @Before
    public void setDriver() {
//        System.setProperty("webdriver.chrome.driver",
//                "C:/Users/Lena/IdeaProjects/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Otunyk/IdeaProjects/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://ridezum.com/");
        driver.manage().window().maximize();
        userDriver =new UserDriver();
        careerPage = new CareerPage(driver);
        jobPage = new JobPage(driver);
        applyForJobPage = new ApplyForJobPage(driver);
        applicationPage = new ApplicationPage(driver);
        userApplicant = new UserApplicant();



    }

//    @After
//    public void close() {
//        driver.quit();
//    }
}