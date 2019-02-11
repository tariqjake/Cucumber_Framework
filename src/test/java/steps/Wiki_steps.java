package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WikipediaPage;
import utilities.Driver;

public class Wiki_steps {
    private WikipediaPage wiki = new WikipediaPage();

    @Given("User is on the Wikipedia homepage")
    public void user_is_on_the_Wikipedia_homepage() {
        Driver.getDriver().get("https://wikipedia.com");
    }

    @When("User enters Steve Jobs to search bar and clicks enter")
    public void user_enters_Steve_Jobs_to_search_bar_and_clicks_enter() {
        wiki.searchBox.sendKeys("Steve Jobs" + Keys.ENTER);
    }

    @Then("User should see the first header is displaying Steve Jobs")
    public void user_should_see_the_first_header_is_displaying_Steve_Jobs() {
        Assert.assertTrue("Wikipedia Header verification failed",wiki.firstHeader.getText().trim().equalsIgnoreCase("Steve Jobs"));
        Driver.closeDriver();
    }
}
