package com.globant.academy.pages;

import com.globant.academy.framework.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.logging.Logger;

public class HomePage extends BasePage {

    private static final Logger LOGGER = Logger.getLogger(HomePage.class.getName());
    private String url;

    public HomePage(WebDriver driver, String url) {
        super(driver);
        this.url = url;
        driver.get(url);
        driver.manage().window().maximize();
    }

    @FindBy(xpath = "//*[@id='sideLogin-left-rail']/button[1]")
    private WebElement signUpButton;

    @FindBy(id = "disneyid-iframe")
    private WebElement registerIframe;

    @FindBy(id = "did-ui-view")
    private WebElement registerModal;

    @FindBy(name = "firstName")
    private WebElement fieldNameInput;

    @FindBy(name = "lastName")
    private WebElement fieldLastNameInput;

    @FindBy(name = "email")
    private WebElement fieldEmailInput;

    @FindBy(name = "newPassword")
    private WebElement fieldNewPasswordInput;

    @FindBy(xpath = "//*[@id='did-ui-view']/div/section/section/form/section[6]/div/button")
    private WebElement signUpButtonInsideModal;

    @FindBy(id = "global-user-trigger")
    private WebElement userIcon;

    @FindBy(linkText = "Log Out")
    private WebElement logOutLink;

    public void verifyHomePage(String url) {
        LOGGER.info("Página actual: " + getDriver().getCurrentUrl());
        LOGGER.info(String.valueOf(getDriver().getCurrentUrl().equals(url)));
    }

    public void clickOnRegisterButton() {
        getWait().until(ExpectedConditions.elementToBeClickable(signUpButton)).click();
    }

    public void theRegistrationModalIsVisible() {
        toIframe(registerIframe);
        getWait().until(ExpectedConditions.elementToBeClickable(registerModal));
    }

    public void iFillInFirstNameWith(String name) {
        fieldNameInput.sendKeys(name);
    }

    public void iFillInLastNameWith(String lastName) {
        fieldLastNameInput.sendKeys(lastName);
    }

    public void iFillInEmailWith(String name) {
        fieldEmailInput.sendKeys(name);
    }

    public void iFillInPasswordWith(String name) {
        fieldNewPasswordInput.sendKeys(name);
    }

    public void clickOnSignUpButtonInsideModal() {
        signUpButtonInsideModal.click();
    }

    public void hoverOverUserIcon() {
        getWait().until(ExpectedConditions.elementToBeClickable(userIcon));
        getAction().moveToElement(userIcon).build().perform();
    }

    public boolean verifyLogOutLink() {
        getWait().until(ExpectedConditions.elementToBeClickable(logOutLink));
        return logOutLink.isDisplayed();
    }
}
