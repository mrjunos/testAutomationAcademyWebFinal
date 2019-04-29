package com.globant.academy.stepdefs;

import com.globant.academy.framework.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.Assert;

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

    @When("I fill in Email Address with {string}")
    public void iFillInEmailAddressWith(String email) {
        baseTest.getHomePage().iFillInEmailWith(email);
    }

    @When("I fill in Password with {string}")
    public void iFillInPasswordWith(String password) {
        baseTest.getHomePage().iFillInPasswordWith(password);
    }

    @When("I put the cursor over the user icon")
    public void iPutTheCursorOverTheUserIcon() {
        baseTest.getHomePage().hoverOverUserIcon();
    }

    @Then("I see a Log Out link")
    public void iSeeALogOutLink() {
        Assert.assertTrue(baseTest.getHomePage().verifyLogOutLink());
    }
}
