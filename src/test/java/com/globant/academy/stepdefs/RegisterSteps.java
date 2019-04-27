package com.globant.academy.stepdefs;

import com.globant.academy.framework.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.Assert;

@RunWith(Cucumber.class)
public class RegisterSteps extends BaseTest {

    private BaseTest baseTest;

    public RegisterSteps(BaseTest baseTest) {
        this.baseTest = baseTest;
    }

    @When("I click on Sign Up button")
    public void clickOnRegisterButton() {
        baseTest.getHomePage().clickOnRegisterButton();
    }

    @When("The registration modal is visible")
    public void theRegistrationModalIsVisible() {
        baseTest.getHomePage().theRegistrationModalIsVisible();
    }

    @When("I fill in First Name with {string}")
    public void iFillInFirstNameWith(String name) {
        baseTest.getHomePage().iFillInFirstNameWith(name);
    }

    @And("I fill in Last Name with {string}")
    public void iFillInLastNameWith(String lastName) {
        baseTest.getHomePage().iFillInLastNameWith(lastName);
    }

    @And("I fill in Email Address with {string}")
    public void iFillInEmailAddressWith(String email) {
        baseTest.getHomePage().iFillInEmailWith(email);
    }

    @And("I fill in Password with {string}")
    public void iFillInPasswordWith(String password) {
        baseTest.getHomePage().iFillInPasswordWith(password);
    }

    @And("I click on Sign Up button Inside Modal")
    public void iClickOnSignUpButtonInsideModal() {
        baseTest.getHomePage().clickOnSignUpButtonInsideModal();
    }

    @When("I put the cursor over the user icon")
    public void iPutTheCursorOverTheUserIcon() {
        baseTest.getHomePage().hoverOverUserIcon();
    }

    @Then("I see a log out link")
    public void iSeeALogOutLink() {
        Assert.assertTrue(baseTest.getHomePage().verifyLogOutLink());
    }
}
