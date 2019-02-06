package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.GooglePage;
import utilities.Driver;

public class GoogleSearch_steps {

    GooglePage googlePage = new GooglePage();

    @Given("User is on the google homepage")
    public void user_is_on_the_google_homepage() {

        Driver.getDriver().get("https://google.com");
    }

    @Given("User puts flowers into search engine")
    public void user_puts_flowers_into_search_engine() {
        googlePage.searchField.sendKeys("flowers");
    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        googlePage.searchBtn.click();
    }

    @Then("User should see results related to flowers")
    public void user_should_see_results_related_to_flowers() {
       Assert.assertTrue("Keyword flowers was not located in title",Driver.getDriver().getTitle().contains("flowers"));
       Driver.closeDriver();
    }

}
