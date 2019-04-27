package com.globant.academy.stepdefs;

import com.globant.academy.drivers.MyDriver;
import com.globant.academy.framework.BaseTest;
import com.globant.academy.pages.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseTest {

    private BaseTest baseTest;

    public Hooks(BaseTest baseTest) {
        this.baseTest = baseTest;
    }

    @Before
    public void beforeScenario() {
        driver = new MyDriver(System.getProperty("browser"));
        baseTest.setDriver(driver);
        baseTest.setHomePage(new HomePage(driver.getDriver(), System.getProperty("url")));
    }

    @After
    public void afterScenario() {
        baseTest.getHomePage().dispose();
    }
}
