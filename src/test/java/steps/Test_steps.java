package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Test_steps {


    @When("user goes to google application")
    public void user_goes_to_google_application() {
        System.out.println("Selenium is going to google");
    }

    @Then("user should searches for apple")
    public void user_should_searches_for_apple() {
        System.out.println("user searching for the worh apple");
    }

    @Then("user should see apple related results")
    public void user_should_see_apple_related_results() {
        System.out.println("User sees the apple");
    }

}
