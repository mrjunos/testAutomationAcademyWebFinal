package com.globant.academy.stepdefs;

import com.globant.academy.framework.BaseTest;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class LoginSteps extends BaseTest {

    private BaseTest baseTest;

    public LoginSteps(BaseTest baseTest) {
        this.baseTest = baseTest;
    }
}
