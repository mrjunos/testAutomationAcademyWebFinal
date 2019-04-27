package com.globant.academy.framework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
        action = new Actions(driver);
        this.driver = driver;
    }

    public void dispose() {
        if(driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public Actions getAction() {
        return action;
    }

    public void toIframe(WebElement iframe) {
        scrollTo(iframe);
        getWait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
    }

    public void toDefault() {
        driver.switchTo().defaultContent();
    }

    public void scrollTo(WebElement element) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
