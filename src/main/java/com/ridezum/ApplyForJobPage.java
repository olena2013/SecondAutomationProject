package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ApplyForJobPage extends BasePage {
    public ApplyForJobPage(WebDriver driver){super(driver);}

    @FindBy(css = ".postings-btn.template-btn-submit.hex-color")
    private List<WebElement> applyParticularJobbutton;

    public ApplicationPage clickApplyParticularJobButton(){
        wait.until(ExpectedConditions.elementToBeClickable
                (applyParticularJobbutton.get(0)));
        applyParticularJobbutton.get(0).click();
        return new ApplicationPage(driver);
    }
}
