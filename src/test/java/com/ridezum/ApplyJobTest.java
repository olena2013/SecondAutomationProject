package com.ridezum;

import org.junit.Test;

public class ApplyJobTest extends BaseTest {
    protected HomePage homePage;
    protected CareerPage careerPage;
    protected JobPage jobPage;

    @Test
    public void applyJobTest(){
        homePage = new HomePage(driver);
    }
}
