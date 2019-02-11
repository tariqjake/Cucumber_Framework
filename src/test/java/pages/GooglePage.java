package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {
    WebDriver driver;

    public GooglePage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy (name ="q")
    public WebElement searchField;

    @FindBy (name = "btnK")
    public WebElement searchBtn;


}
