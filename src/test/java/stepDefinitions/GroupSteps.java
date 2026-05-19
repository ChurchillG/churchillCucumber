package stepDefinitions;
import io.cucumber.java.en.And;

import pages.GroupPage;

public class GroupSteps {

    GroupPage groupPage = new GroupPage();

    @And("I click on the logged in user")
    public void clickLoggedInUser() {

        groupPage.clickLoggedInUser();
    }

    @And("I click on the admin panel")
    public void clickAdminPanel() {

        groupPage.clickAdminPanel();
    }

    @And("I click on the groups tab")
    public void clickGroupsTab() {

        groupPage.clickGroupsTab();
    }

    @And("I click on the create group button")
    public void clickCreateGroupButton() {

        groupPage.clickCreateGroupButton();
    }

    @And("^I enter group name (.+)$")
    public void enterGroupName(String value) {

        groupPage.enterGroupName(value);
    }

    @And("^I enter group description (.+)$")
    public void enterGroupDescription(String value) {

        groupPage.enterGroupDescription(value);
    }

    @And("^I enter year (.+)$")
    public void enterYear(String value) {

        groupPage.enterYear(value);
    }

    @And("^I enter max capacity (.+)$")
    public void enterMaxCapacity(String value) {

        groupPage.enterMaxCapacity(value);
    }

    @And("^I enter start date (.+)$")
    public void enterStartDate(String value) {

        groupPage.enterStartDate(value);
    }

    @And("^I enter end date (.+)$")
    public void enterEndDate(String value) {

        groupPage.enterEndDate(value);
    }

    @And("I click on save group button")
    public void clickSaveGroupButton() {

        groupPage.clickSaveGroupButton();
    }
}
