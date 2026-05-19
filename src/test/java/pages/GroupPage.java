package pages;
import org.openqa.selenium.By;

import utils.DriverFactory;
public class GroupPage {
    By loggedInUser = By.id("loggedInUser");

    By adminPanel = By.id("adminPanel");

    By groupsTab = By.id("groupsTab");

    By createGroupButton = By.id("createGroup");

    By groupName = By.id("groupName");

    By groupDescription = By.id("groupDescription");

    By year = By.id("year");

    By maxCapacity = By.id("maxCapacity");

    By startDate = By.id("startDate");

    By endDate = By.id("endDate");

    By saveGroupButton = By.id("saveGroup");

    public void clickLoggedInUser() {

        DriverFactory.getDriver()
                .findElement(loggedInUser)
                .click();
    }

    public void clickAdminPanel() {

        DriverFactory.getDriver()
                .findElement(adminPanel)
                .click();
    }

    public void clickGroupsTab() {

        DriverFactory.getDriver()
                .findElement(groupsTab)
                .click();
    }

    public void clickCreateGroupButton() {

        DriverFactory.getDriver()
                .findElement(createGroupButton)
                .click();
    }

    public void enterGroupName(String value) {

        DriverFactory.getDriver()
                .findElement(groupName)
                .sendKeys(value);
    }

    public void enterGroupDescription(String value) {

        DriverFactory.getDriver()
                .findElement(groupDescription)
                .sendKeys(value);
    }

    public void enterYear(String value) {

        DriverFactory.getDriver()
                .findElement(year)
                .sendKeys(value);
    }

    public void enterMaxCapacity(String value) {

        DriverFactory.getDriver()
                .findElement(maxCapacity)
                .sendKeys(value);
    }

    public void enterStartDate(String value) {

        DriverFactory.getDriver()
                .findElement(startDate)
                .sendKeys(value);
    }

    public void enterEndDate(String value) {

        DriverFactory.getDriver()
                .findElement(endDate)
                .sendKeys(value);
    }

    public void clickSaveGroupButton() {

        DriverFactory.getDriver()
                .findElement(saveGroupButton)
                .click();
    }
}
