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
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));
        Driver.getDriver().close();
    }

    @Then("validate the url")
    public void validate_the_url() {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.amazon.com/");
        Driver.getDriver().close();
    }

}
