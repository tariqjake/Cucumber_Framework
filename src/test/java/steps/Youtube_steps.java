package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.YoutubePage;
import sun.tools.tree.ConditionalExpression;
import utilities.Driver;

import java.util.concurrent.locks.Condition;

public class Youtube_steps {

    private YoutubePage youtubePage = new YoutubePage();
    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @Given("User is on the youtube homepage")
    public void user_is_on_the_youtube_homepage() {
        Driver.getDriver().get("https://youtube.com");
    }

    @Given("User is able to see the search box")
    public void user_is_able_to_see_the_search_box() {
       Assert.assertTrue("Youtube Search box not is Displayed",youtubePage.searchBox.isDisplayed());
    }

    @Given("User is able to see the search button")
    public void user_is_able_to_see_the_search_button() {
        Assert.assertTrue("Youtube Search button not is Displayed",youtubePage.searchBtn.isDisplayed());
    }

    @When("User searches for FUNNY CAT VIDEOS")
    public void user_searches_for_FUNNY_CAT_VIDEOS() {
        wait.until(ExpectedConditions.elementToBeClickable(youtubePage.searchBox));
       youtubePage.searchBox.sendKeys("FUNNY CAT VIDEOS" + Keys.ENTER);
    }

    @Then("User should see results related to funny cat videos")
    public void user_should_see_results_related_to_funny_cat_videos() {
        wait.until(ExpectedConditions.titleContains("CAT"));
      Assert.assertTrue(Driver.getDriver().getTitle().contains("FUNNY CAT VIDEOS"));
      Driver.closeDriver();
    }



    @When("User searches for FUNNY DOG VIDEOS")
    public void user_searches_for_FUNNY_DOG_VIDEOS() {
        wait.until(ExpectedConditions.elementToBeClickable(youtubePage.searchBox));
        youtubePage.searchBox.sendKeys("FUNNY DOG VIDEOS" + Keys.ENTER);
    }

    @Then("User should see results related to funny dog videos")
    public void user_should_see_results_related_to_funny_dog_videos() {
        wait.until(ExpectedConditions.titleContains("DOG"));
        Assert.assertTrue(Driver.getDriver().getTitle().contains("FUNNY DOG VIDEOS"));
        Driver.closeDriver();
    }

    @When("User searches for FUNNY PET VIDEOS")
    public void user_searches_for_FUNNY_PET_VIDEOS() {
        wait.until(ExpectedConditions.elementToBeClickable(youtubePage.searchBox));
        youtubePage.searchBox.sendKeys("FUNNY PET VIDEOS" + Keys.ENTER);
    }

    @Then("User should see results related to funny pet videos")
    public void user_should_see_results_related_to_funny_pet_videos() {
        wait.until(ExpectedConditions.titleContains("PET"));
        Assert.assertTrue(Driver.getDriver().getTitle().contains("FUNNY PET VIDEOS"));
        Driver.closeDriver();
    }

}
