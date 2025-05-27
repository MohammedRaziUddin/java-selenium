package BDD.StepDefination;

import BDD.Pages.LoginPage;
import BDD.Util.BaseClass;
import cucumber.api.CucumberOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass {

    @Given("User navigate to the application")
    public void userNavigateToTheApplication() {
        Setup();
    }

    @When("User enters the creds")
    public void userEntersTheCreds() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.fillLoginForm();
    }

    @Then("User should see the dashboard")
    public void userShouldSeeTheDashboard() {
        LoginPage loginPage = new LoginPage();
        loginPage.dashboard();
        driver.quit();
    }
}
