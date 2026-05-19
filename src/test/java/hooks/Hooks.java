package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;

import utils.DriverFactory;
import utils.ExtentManager;
import utils.ScreenshotUtils;
public class Hooks {
    @Before
    public void setup() {

        DriverFactory.getDriver();

        ExtentManager.getReport();
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

            ScreenshotUtils.captureScreenshot(
                    scenario.getName()
            );
        }

        DriverFactory.quitDriver();

        ExtentManager.getReport().flush();
    }
}
