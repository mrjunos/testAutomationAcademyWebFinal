package com.globant.academy.stepdefs;

import com.globant.academy.framework.BaseTest;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class RegisterSteps extends BaseTest {

    public RegisterSteps(BaseTest baseTest) {
        this.homePage = baseTest.getHomePage();
    }

    @When("I click on Sign Up button")
    public void clickOnRegisterButton() {
        homePage.clickOnRegisterButton();
    }

    @When("The registration modal is visible")
    public void theRegistrationModalIsVisible() {
        homePage.theRegistrationModalIsVisible();
    }

    @When("I fill in First Name with {string}")
    public void iFillInFirstNameWith(String name) {
        homePage.iFillInFirstNameWith(name);
    }

    @When("I fill in Last Name with {string}")
    public void iFillInLastNameWith(String lastName) {
        homePage.iFillInLastNameWith(lastName);
    }

    @When("I click on Sign Up button Inside Modal")
    public void iClickOnSignUpButtonInsideModal() {
        homePage.clickOnSignUpButtonInsideModal();
    }
}
