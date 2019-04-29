package com.globant.academy.stepdefs;

import com.globant.academy.framework.BaseTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class LogOutSteps extends BaseTest {

    public LogOutSteps(BaseTest baseTest) {
        this.homePage = baseTest.getHomePage();
    }

    @When("I am logged in with {string} and {string}")
    public void iAmLoggedInWithAnd(String email, String password) {
        homePage.logIn(email, password);
    }

    @When("I click on the Log Out link")
    public void iClickOnTheLogOutLink() {
        homePage.clickOnLogOutLink();
    }

    @Then("I see a Log In button")
    public void iSeeALogInButton() {
        homePage.verifyLogInButton();
    }
}
