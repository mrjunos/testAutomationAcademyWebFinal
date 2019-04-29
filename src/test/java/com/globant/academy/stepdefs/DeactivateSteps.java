package com.globant.academy.stepdefs;

import com.globant.academy.framework.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.Assert;

@RunWith(Cucumber.class)
public class DeactivateSteps extends BaseTest {

    public DeactivateSteps(BaseTest baseTest) {
        this.homePage = baseTest.getHomePage();
    }

    @When("I click on the ESPN Profile Link")
    public void iClickOnTheESPNProfileLink() {
        homePage.clickOnEspnProfileLink();
    }

    @And("The Update Your Account modal is visible")
    public void theUpdateYourAccountModalIsVisible() {
        homePage.theUpdateYourAccountModalIsVisible();
    }

    @And("I Scroll to Delete Account Link")
    public void iScrollToDeleteAccountLink() {
        homePage.scrollToDeleteAccountLink();
    }

    @And("I click on Delete Account Link")
    public void iClickOnDeleteAccountLink() {
        homePage.clickOnDeleteAccountLink();
    }

    @And("The Yes, delete this account Button is visible")
    public void theYesDeleteThisAccountButtonIsVisible() {
        homePage.verifyDeleteThisAccountButton();
    }

    @And("I click on Yes, delete this account Button")
    public void iClickOnYesDeleteThisAccountButton() {
        homePage.clickOnDeleteThisAccountButton();
    }

    @Then("I see a Your Account Has Been Deleted label")
    public void iSeeAYourAccountHasBeenDeletedLabel() {
        Assert.assertTrue(homePage.verifyDeletedAccountLabel());
    }
}
