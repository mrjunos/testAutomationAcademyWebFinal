package com.globant.academy.stepdefs;

import com.globant.academy.framework.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class BaseSteps extends BaseTest {

    private BaseTest baseTest;

    public BaseSteps(BaseTest baseTest) {
        this.baseTest = baseTest;
    }

    @Given("I am in {string} Page")
    public void iAmInPage(String url) {
        baseTest.getHomePage().verifyHomePage(url);
    }
}
