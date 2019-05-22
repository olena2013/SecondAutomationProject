package com.ridezum;

import org.junit.Test;

public class ApplyJobTest extends BaseTest {
    protected HomePage homePage;
    protected CareerPage careerPage;
    protected JobPage jobPage;
    protected ApplyForJobPage applyForJobPage;

    @Test
    public void applyJobTest(){
        homePage = new HomePage(driver);
        careerPage = homePage.clickCareerButton();

        jobPage = careerPage.clickJobButton();
        driver.switchTo().window("\"https://jobs.lever.co/ridezum\"");
        applyForJobPage = jobPage.clickApplyForJobButton();
        }
        }
