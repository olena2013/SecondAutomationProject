package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class JobPage extends BasePage {
    public JobPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".posting-btn-submit.template-btn-submit.hex-color")
    private List<WebElement> applyJobButton;

    public ApplyForJobPage clickApplyForJobButton(){
        wait.until(ExpectedConditions.elementToBeClickable(applyJobButton.get(0)));
        applyJobButton.get(0).click();
        return new ApplyForJobPage(driver);

    }
}
