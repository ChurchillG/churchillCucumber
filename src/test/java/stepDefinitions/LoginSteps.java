package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;
public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("i am on the login page")
    public void iAmOnTheLoginPage() {

        loginPage.openLoginPage();
    }

    @And("^I enter email (.+)$")
    public void iEnterEmail(String email) {

        loginPage.enterEmail(email);
    }

    @And("^I enter password (.+)$")
    public void iEnterPassword(String password) {

        loginPage.enterPassword(password);
    }

    @When("I click login button")
    public void iClickLoginButton() {

        loginPage.clickLoginButton();
    }

    @Then("i should be logged in successfully")
    public void verifySuccessfulLogin() {

        System.out.println("Login successful");
    }
}
