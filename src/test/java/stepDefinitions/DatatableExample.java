package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AutomationPage;
import utilities.ParameterDriver;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        var rows = formValues.asMaps(String.class, String.class); // java 11

        for(Map<String, String> row: rows){
            page.sendKeysMethod(page.nameInput, row.get("name"));
            page.sendKeysMethod(page.emailInput, row.get("email"));
            page.sendKeysMethod(page.subjectInput, row.get("subject"));
            page.sendKeysMethod(page.messageInput, row.get("message"));

        }
        System.out.println("scenario called");
        Thread.sleep(4000);

    }
    @Given("Click Submit Button")
    public void click_submit_button() {
//        page.clickMethod(page.submitButton);
    }
    @Then("Verify Form is submitted")
    public void verify_form_is_submitted() {
        System.out.println("Done");
    }



}
