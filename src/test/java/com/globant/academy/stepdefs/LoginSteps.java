package com.globant.academy.stepdefs;

import com.globant.academy.framework.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class LoginSteps extends BaseTest {

    public LoginSteps(BaseTest baseTest) {
        this.homePage = baseTest.getHomePage();
    }

    @When("I click on Log In button")
    public void iClickOnLogInButton() {
        homePage.clickOnLogInButton();
    }

    @When("The Log In modal is visible")
    public void theLogInModalIsVisible() {
        homePage.theLogInModalIsVisible();
    }

    @And("I click on Log In button Inside Modal")
    public void iClickOnLogInButtonInsideModal() {
        homePage.iClickOnLogInButtonInsideModal();
    }
}
