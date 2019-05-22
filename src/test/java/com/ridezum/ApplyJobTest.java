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

        applicationPage.inputFullName(userApplicant.getFullName());
        applicationPage.inputEmail(userApplicant.getEmail());
        applicationPage.inputPhone(userApplicant.getPhone());
        applicationPage.inputCurrentCompany(userApplicant.getCompany());
        applicationPage.inputLinkedInUrl(userApplicant.getLinkedIn());
        applicationPage.inputPortfolioUrl(userApplicant.getPortfolio());
        applicationPage.inputAddInfo(userApplicant.getAddInfo());
        applicationPage.selectGenger();
        applicationPage.selectRace();
        applicationPage.selectVeteranStatus();
        applicationPage.clickSubmitButton();
    }
}
