package stepDefinitions;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class Palindrome {

    private String testPalindrome;
    private boolean isPalindrome;

    @Given("I entered a word {string}")
    public void i_entered_a_word(String word) {
        System.out.println(word);
        testPalindrome = word;
    }
    @When("I test it for Palindrome")
    public void i_test_it_for_palindrome() {
        System.out.println("works");
        isPalindrome = testPalindrome.equalsIgnoreCase(new StringBuilder(testPalindrome).reverse().toString());
    }
    @Then("the output should be {string}")
    public void the_output_should_be(String result) {

        boolean expectedResult = Boolean.parseBoolean(result);
        if (expectedResult){
            Assert.assertTrue(isPalindrome);
        } else {
            Assert.assertFalse(isPalindrome);
        }

    }


}
