package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DataTablePage {
    public DataTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newBtn;

    @FindBy (xpath = "//form[@data-dte-e='form']")
    public WebElement newEmployeeForm;

    @FindBy (id = "DTE_Field_first_name")
    public WebElement firstNameInput;

    @FindBy (id = "DTE_Field_last_name")
    public WebElement lastNameInput;

    @FindBy (id = "DTE_Field_position")
    public WebElement positionInput;

    @FindBy (id = "DTE_Field_office")
    public WebElement officeInput;

    @FindBy (id = "DTE_Field_extn")
    public WebElement extensionInput;

    @FindBy (id = "DTE_Field_start_date")
    public WebElement startDateInput;

    @FindBy (id = "DTE_Field_salary")
    public WebElement salaryInput ;

    @FindBy(css = ".btn")
    public WebElement createBtn;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy (xpath = "//table[@id='example']//td[2]")
    public List<WebElement> nameSearchedList;



}
