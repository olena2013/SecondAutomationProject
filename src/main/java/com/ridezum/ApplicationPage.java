package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ApplicationPage extends BasePage {
    public ApplicationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css ="input")
    private List<WebElement> inputFields;

    /*
    [1] -fullName
    [2] -email
    [3] - phone
    [4] - current company
    [5] - LinkedIn URL
    [6] - Portfolio URL
     */
    public void inputFullName(String fullName){
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(1)));
        inputFields.get(1).sendKeys(fullName);
    }
    public void inputEmail(String email){
        inputFields.get(2).sendKeys(email);
    }
    public void inputPhone(String phone){
        inputFields.get(3).sendKeys(phone);
    }
    public void inputCurrentCompany(String company){
        inputFields.get(4).sendKeys(company);
    }
    public void inputLinkedInUrl(String linkedIn){
        inputFields.get(5).sendKeys(linkedIn);
    }
    public void inputPortfolioUrl(String portfolio){
        inputFields.get(6).sendKeys(portfolio);
    }
}
