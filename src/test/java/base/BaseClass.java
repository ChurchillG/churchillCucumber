package base;
import org.openqa.selenium.WebDriver;

import utils.DriverFactory;
public class BaseClass {
    public WebDriver driver;

    public BaseClass() {

        driver = DriverFactory.getDriver();
    }
}
