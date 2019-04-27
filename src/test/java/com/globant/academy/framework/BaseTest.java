package com.globant.academy.framework;

import com.globant.academy.drivers.MyDriver;
import com.globant.academy.pages.HomePage;

public class BaseTest {
    protected MyDriver driver;
    protected HomePage homePage;

    public MyDriver getDriver() {
        return driver;
    }

    public void setDriver(MyDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public void setHomePage(HomePage homePage) {
        this.homePage = homePage;
    }
}
