package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".main-menu__link")
    private List<WebElement> headerButtons;

    public DriverPage clickDriverButton() {
        wait.until(ExpectedConditions.elementToBeClickable(headerButtons.get(2)));
        headerButtons.get(2).click();
        return new DriverPage(driver);

    }

}

