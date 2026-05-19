package pages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import utils.DriverFactory;

import java.util.List;
public class SignUpPage {

    By groupDropdownOptions = By.tagName("option");

    public boolean validateGroupExists(String expectedGroup) {

        List<WebElement> groups =
                DriverFactory.getDriver()
                        .findElements(groupDropdownOptions);

        for (WebElement group : groups) {

            if (group.getText()
                    .equalsIgnoreCase(expectedGroup)) {

                return true;
            }
        }

        return false;
    }
}
