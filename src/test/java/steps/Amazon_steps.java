package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utilities.Driver;

public class Amazon_steps {

    @When("user goes to amazon website")
    public void user_goes_to_amazon_website() {
        Driver.getDriver().get("https://amazon.com");
    }

    @Then("verify it contains the word Amazon")
    public void verify_it_contains_the_word_Amazon() {
       Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));
       Driver.closeDriver();
    }

    @Then("validate the url")
    public void validate_the_url() {
       Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("amazon"));
       Driver.closeDriver();
    }


}
