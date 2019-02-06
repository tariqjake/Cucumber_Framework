package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DataTablePage;
import utilities.Driver;

public class DataTables_steps {
    private DataTablePage dataTablePage = new DataTablePage();
    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);


    @Given("User is on the datatables homepage")
    public void user_is_on_the_datatables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @Given("User clicks to New Button")
    public void user_clicks_to_New_Button() {
        dataTablePage.newBtn.click();

    }

    @Then("User should see Create New Entry Box")
    public void user_should_see_Create_New_Entry_Box() {
        wait.until(ExpectedConditions.visibilityOf(dataTablePage.newEmployeeForm));
        Assert.assertTrue("User can not see New Entry Box",dataTablePage.newEmployeeForm.isDisplayed());
    }

    @Then("User should enter firstname")
    public void user_should_enter_firstname() {
dataTablePage.firstNameInput.sendKeys("John");
    }

    @Then("User should enter lastname")
    public void user_should_enter_lastname() {
dataTablePage.lastNameInput.sendKeys("Kagawa");
    }

    @Then("User should enter position")
    public void user_should_enter_position() {
dataTablePage.positionInput.sendKeys("Retired Hitman");
    }

    @Then("User should enter office")
    public void user_should_enter_office() {
dataTablePage.officeInput.sendKeys("Mclean VA");
    }

    @Then("User should enter extension")
    public void user_should_enter_extension() {
dataTablePage.extensionInput.sendKeys("312");
    }

    @Then("User should enter start date")
    public void user_should_enter_start_date() {
dataTablePage.startDateInput.sendKeys("2019-02-10");
    }

    @Then("User should enter salary")
    public void user_should_enter_salary() {
dataTablePage.salaryInput.sendKeys("120000");
    }

    @Then("User should click to create button")
    public void user_should_click_to_create_button() {
        dataTablePage.createBtn.click();
    }

    @Then("User searches first name in search Box")
    public void user_searches_first_name_in_search_Box() {
dataTablePage.searchBox.sendKeys("John Kagawa" + Keys.ENTER);
    }

    @Then("User should see first name is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table() {
        wait.until(ExpectedConditions.visibilityOf(dataTablePage.nameSearchedList.get(0)));
    String name = "John Kagawa";
        for (WebElement nameElement: dataTablePage.nameSearchedList) {
            if(nameElement.getText().contains(name)){
                Assert.assertTrue(true);
                Driver.getDriver().close();
                return;
            }
        }
        Assert.assertTrue("The name is not found",false);
    }

    //@Then("User should enter firstname {string})
    @Then("User should enter firstname {string}")
    public void user_should_enter_firstname(String firstName) {
    dataTablePage.firstNameInput.sendKeys(firstName);
    }

    @Then("User should enter lastname {string}")
    public void user_should_enter_lastname(String lastName) {
        dataTablePage.lastNameInput.sendKeys(lastName);
    }

    @Then("User should enter position {string}")
    public void user_should_enter_position(String position) {
       dataTablePage.positionInput.sendKeys(position);
        }

    @Then("User should enter office {string}")
    public void user_should_enter_office(String office) {
        dataTablePage.officeInput.sendKeys(office);
    }

    @Then("User should enter extension {string}")
    public void user_should_enter_extension(String extension) {
       dataTablePage.extensionInput.sendKeys(extension);
    }

    @Then("User should enter start date {string}")
    public void user_should_enter_start_date(String startDate) {
       dataTablePage.startDateInput.sendKeys(startDate);
    }

    @Then("User should enter salary {string}")
    public void user_should_enter_salary(String salary) {
       dataTablePage.salaryInput.sendKeys(salary);
    }


    @Then("User searches first name {string} in search Box")
    public void user_searches_first_name_in_search_Box(String name) {
        dataTablePage.searchBox.sendKeys(name + Keys.ENTER); }

    @Then("User should see first name {string} is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table(String name) {
        wait.until(ExpectedConditions.visibilityOf(dataTablePage.nameSearchedList.get(0)));
        for (WebElement nameElement: dataTablePage.nameSearchedList) {
            wait.until(ExpectedConditions.visibilityOf(dataTablePage.nameSearchedList.get(0)));
            if(nameElement.getText().contains(name)){
                Assert.assertTrue(true);
                return;
            }
        }
        Assert.assertTrue("The name \""+ name+"\" is not found"  ,false);
    }

    @Then("User should enter salary {int}")
    public void user_should_enter_salary(Integer salary) {
       dataTablePage.salaryInput.sendKeys(""+salary);
    }



}
