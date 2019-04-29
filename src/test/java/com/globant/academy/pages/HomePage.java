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

    @FindBy(id = "disneyid-iframe")
    private WebElement registerModal;

    @FindBy(name = "firstName")
    private WebElement fieldNameInput;

    @FindBy(name = "lastName")
    private WebElement fieldLastNameInput;

    @FindBy(css = "input[type='email']")
    private WebElement fieldEmailInput;

    @FindBy(css = "input[type='password']")
    private WebElement fieldNewPasswordInput;

    @FindBy(xpath = "//*[@id='did-ui-view']/div/section/section/form/section[6]/div/button")
    private WebElement signUpButtonInsideModal;

    @FindBy(id = "global-user-trigger")
    private WebElement userIcon;

    @FindBy(linkText = "Log Out")
    private WebElement logOutLink;

    @FindBy(xpath = "//*[@id='sideLogin-left-rail']/button[2]")
    private WebElement logInButton;

    @FindBy(id = "disneyid-iframe")
    private WebElement logInIframe;

    @FindBy(css = "[class='btn btn-primary btn-submit ng-isolate-scope']")
    private WebElement logInButtonInsideModal;

    @FindBy(linkText = "ESPN Profile")
    private WebElement espnProfileLink;

    @FindBy(id = "disneyid-iframe")
    private WebElement profileIframe;

    @FindBy(linkText = "Delete Account")
    private WebElement deleteAccountLink;

    @FindBy(xpath = "//*[@id='did-ui-view']/div/section/section/div[2]/button[1]")
    private  WebElement deleteAccountButton;

    @FindBy(xpath = "//*[contains(text(), 'Your account has been deleted')]")
    private WebElement deletedAccountLabel;

    public void verifyHomePage(String url) {
        LOGGER.info("Página actual: " + getDriver().getCurrentUrl());
        LOGGER.info(String.valueOf(getDriver().getCurrentUrl().equals(url)));
    }

    public void clickOnRegisterButton() {
        getWait().until(ExpectedConditions.elementToBeClickable(signUpButton)).click();
    }

    public void theRegistrationModalIsVisible() {
        getWait().until(ExpectedConditions.elementToBeClickable(registerModal));
        toIframe(registerIframe);
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

    public void clickOnLogInButton() {
        logInButton.click();
    }

    public void theLogInModalIsVisible() {
        getWait().until(ExpectedConditions.elementToBeClickable(logInIframe));
        toIframe(logInIframe);
    }

    public void iClickOnLogInButtonInsideModal() {
        logInButtonInsideModal.click();
    }

    public void logIn(String email, String password) {
        clickOnLogInButton();
        theLogInModalIsVisible();
        iFillInEmailWith(email);
        iFillInPasswordWith(password);
        iClickOnLogInButtonInsideModal();
    }

    public void clickOnLogOutLink() {
        logOutLink.click();
    }

    public boolean verifyLogInButton() {
        return logInButton.isDisplayed();
    }

    public void clickOnEspnProfileLink() {
        espnProfileLink.click();
    }

    public void theUpdateYourAccountModalIsVisible() {
        getWait().until(ExpectedConditions.elementToBeClickable(profileIframe));
        toIframe(profileIframe);
    }

    public void scrollToDeleteAccountLink() {
        scrollTo(deleteAccountLink);
    }

    public void clickOnDeleteAccountLink() {
        deleteAccountLink.click();
    }

    public void verifyDeleteThisAccountButton() {
        pause(2);
        toDefault();
        toIframe(profileIframe);
        getWait().until(ExpectedConditions.elementToBeClickable(deleteAccountButton));
    }

    public void clickOnDeleteThisAccountButton() {
        deleteAccountButton.click();
    }

    public boolean verifyDeletedAccountLabel() {
        return getWait().until(ExpectedConditions.elementToBeClickable(deletedAccountLabel)).isDisplayed();
    }
}
