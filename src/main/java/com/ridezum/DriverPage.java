package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DriverPage extends BasePage {
    public DriverPage(WebDriver driver) {super(driver);}

    @FindBy(css = "#application_form_first_name")
    private WebElement firstNameField;

    @FindBy(css = "#application_form_last_name")
    private WebElement lastNameField;

    @FindBy(css = "#application_form_email")
    private WebElement emailField;

    @FindBy(css = "#application_form_phone_number")
    private WebElement phoneField;

    @FindBy(css = "#application_form_applicant_region")
    private WebElement selectAreaField;

    @FindBy(css = "#application_form_zipcode")
    private WebElement zipCodeField;

    @FindBy(css = "#application_form_refcode")
    private WebElement refferalCodeField;

    @FindBy(css = "button[name=\"button\"]")
    private WebElement submitButton;

    @FindBy(css = ".help-block")
    private List<WebElement> errorMessage;


    public String getErrorMessage(){
        wait.until(ExpectedConditions.visibilityOfAllElements(errorMessage.get(4)));
        String result = errorMessage.get(4).getText();
        return result;
    }


    public void selectArea() {
        wait.until(ExpectedConditions.elementToBeClickable(selectAreaField));
        Select select = new Select(selectAreaField);
        select.selectByValue("SF Bay Area");
    }

    public void inputFirstName(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstName); }

    public void inputLastName(String lastName) {
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.sendKeys(lastName);
    }

    public void inputEmail(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }

    public void inputPhone(String phone) {
        wait.until(ExpectedConditions.elementToBeClickable(phoneField));
        phoneField.sendKeys(phone);
    }

    public void inputAreaField() {
        selectAreaField.click();
    }
    public void inputZipCode(String zipCode){
        wait.until(ExpectedConditions.elementToBeClickable(zipCodeField));
        zipCodeField.sendKeys(zipCode);

    }
    public void inputRefferalCode(String zipCode){
        wait.until(ExpectedConditions.elementToBeClickable(refferalCodeField));
        refferalCodeField.sendKeys(zipCode);

    }
    public void clickSubmitButton(){
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
    }


}