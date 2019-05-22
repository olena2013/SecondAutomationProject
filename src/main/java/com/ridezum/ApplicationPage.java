package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationPage extends BasePage {
    public ApplicationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css ="")
    private WebElement inputFullNameField;

    @FindBy(css ="")
    private WebElement inputEmailField;

    @FindBy(css ="")
    private WebElement inputPhoneField;

    @FindBy(css ="")
    private WebElement inputCurrentCompanyField;

    @FindBy(css ="")
    private WebElement inputLinkedInUrlField;

    @FindBy(css ="")
    private WebElement inputPortfolioUrlField;

    @FindBy(css ="")
    private WebElement inputAdditionalInformationField;

    @FindBy(css ="")
    private WebElement inputGenderField;

    @FindBy(css = "")
    private WebElement inputRaceField;

    @FindBy(css = "")
    private WebElement inputVeteranStatusField;

    @FindBy(css = "")
    private WebElement submitButton;


}
