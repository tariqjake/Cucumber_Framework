package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy (xpath = "//a[@id='bcKwText']//span")
    public WebElement searchVerificationTitle;

    @FindBy(xpath = "//span[@id='nav-search-submit-text']//following-sibling::input")
    public WebElement searchBtn;





}
