package com.globant.academy.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.*;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.globant.academy.stepdefs",
        tags = "@register,@login,@logout,@deactivate",
        plugin = {"pretty"}
)
public class TestRunner {

    private TestNGCucumberRunner testNGCucumberRunner;

    @Parameters({"browser", "url"})
    @BeforeClass(alwaysRun = true)
    public void beforeClass(String browser, String url) {
        System.setProperty("browser", browser);
        System.setProperty("url", url);
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(description = "Runs Cucumber Scenario", dataProvider = "scenarios")
    public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {
        testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());
    }

    @DataProvider(name = "scenarios")
    public Object[][] scenarios() {
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        testNGCucumberRunner.finish();
    }

}
