package stepDefinitions;

import pages.DialogContent;
import utilities.ParameterDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        ParameterDriver.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password")
    public void enter_username_and_password() {
        dc.sendKeysMethod(dc.username,"turkeyts");
        dc.sendKeysMethod(dc.password,"TechnoStudy123");
    }

    @When("Click on Login Button")
    public void click_on_login_button() {
        dc.loginButton.click();
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println("works");
        dc.assertText(dc.dashBoard,"Dashboard");
    }
}
