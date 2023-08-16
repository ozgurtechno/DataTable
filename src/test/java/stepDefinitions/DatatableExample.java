package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AutomationPage;
import utilities.ParameterDriver;


import java.util.List;

public class DatatableExample {

    AutomationPage page = new AutomationPage();

    @Given("Navigate to Exercise page")
    public void navigate_to_exercise_page() {
        ParameterDriver.getDriver().get("https://www.automationexercise.com/");
    }
    @Given("Click on the Contact Us Button")
    public void click_on_the_contact_us_button() {
        page.clickMethod(page.contactUs);
    }
    @Given("Fill the Form with this Data")
    public void fill_the_form_with_this_data(DataTable formValues) throws InterruptedException {

        List<String> rows = formValues.transpose().asList(String.class);

        page.sendKeysMethod(page.nameInput, rows.get(0));
        page.sendKeysMethod(page.emailInput, rows.get(1));
        page.sendKeysMethod(page.subjectInput, rows.get(2));
        page.sendKeysMethod(page.messageInput, rows.get(3));
        Thread.sleep(4000);

    }
    @Given("Click Submit Button")
    public void click_submit_button() {
        page.clickMethod(page.submitButton);
    }
    @Then("Verify Form is submitted")
    public void verify_form_is_submitted() {

    }



}
