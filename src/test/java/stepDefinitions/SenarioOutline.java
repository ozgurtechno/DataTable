package stepDefinitions;
import io.cucumber.java.en.*;
public class SenarioOutline {

    @Given("there are {int} cucumbers")
    public void there_are_cucumbers(Integer int1) {
        System.out.println(int1);
    }
    @When("I eat {int} cucumbers")
    public void i_eat_cucumbers(Integer int1) {
        System.out.println(int1);
    }
    @Then("I should have {int} cucumbers")
    public void i_should_have_cucumbers(Integer int1) {
        System.out.println(int1);
    }
}
