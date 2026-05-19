package pages;
import org.openqa.selenium.By;

import utils.ConfigReader;
import utils.DriverFactory;
import utils.WaitUtils;
public class LoginPage {

    By emailField = By.id("email");

    By passwordField = By.id("password");

    By loginButton = By.id("loginBtn");

    public void openLoginPage() {

        DriverFactory.getDriver().get(
                ConfigReader
                        .getProperties()
                        .getProperty("baseUrl")
        );
    }

    public void enterEmail(String email) {

        WaitUtils.waitForElement(emailField);

        DriverFactory.getDriver()
                .findElement(emailField)
                .sendKeys(email);
    }

    public void enterPassword(String password) {

        DriverFactory.getDriver()
                .findElement(passwordField)
                .sendKeys(password);
    }

    public void clickLoginButton() {

        DriverFactory.getDriver()
                .findElement(loginButton)
                .click();
    }
}
