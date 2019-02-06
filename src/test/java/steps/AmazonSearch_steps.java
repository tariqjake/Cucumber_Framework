package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonSearch_steps {
    private AmazonPage amazonPage = new AmazonPage();

    @Given("User is on the amazon homepage")
    public void user_is_on_the_amazon_homepage() {
        Driver.getDriver().get("https://amazonPage.com");
    }

    @When("User enters headphones keyword")
    public void user_enters_headphones_keyword() {
        amazonPage.searchBox.sendKeys("headphones");
    }

    @When("User clicks to search button")
    public void user_clicks_to_search_button() {
        amazonPage.searchBtn.click();
    }

    @Then("User should see headphones in results")
    public void user_should_see_headphones_in_results() {
        Assert.assertEquals("Searched keyword verification failed", amazonPage.searchVerificationTitle.getText().trim(),"\"headphones\"");
        Driver.closeDriver();
    }

}
