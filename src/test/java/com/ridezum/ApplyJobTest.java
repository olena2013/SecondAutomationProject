package com.ridezum;

import org.junit.Test;

public class ApplyJobTest extends BaseTest {
    protected HomePage homePage;
    protected CareerPage careerPage;
    protected JobPage jobPage;
    protected ApplyForJobPage applyForJobPage;

    @Test
    public void applyJobTest() {
        homePage = new HomePage(driver);
        careerPage = homePage.clickCareerButton();
        //Remember previous window
        String windowHandelBefore = driver.getWindowHandle();

        //Return back to the first window
        //  driver.switchTo().window(windowHandelBefore);

        jobPage = careerPage.clickJobButton();
        //Switch to new window
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        applyForJobPage = jobPage.clickApplyForJobButton();
        applicationPage = applyForJobPage.clickApplyParticularJobButton();

        applicationPage.inputFullName(userDriver.getFirstName());
        applicationPage.inputEmail(userDriver.getEmail());
        applicationPage.inputPhone(userDriver.getPhone());
        applicationPage.inputCurrentCompany(userDriver.getCompany());
        applicationPage.inputLinkedInUrl(userDriver.getLinkedIn());
        applicationPage.inputPortfolioUrl(userDriver.getPortfolio());
    }
}
