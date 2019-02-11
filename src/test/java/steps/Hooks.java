package steps;

import com.sun.tools.internal.ws.wsdl.document.Output;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.io.File;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){
        System.out.println("This is running before each scenario");
    }


    @After
    public void tearDown(Scenario scenario){
        System.out.println("This is running after each scenario ");
        if(scenario.isFailed()) {
          final byte [] SCREENSHOT = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
          scenario.embed(SCREENSHOT,"image/png");
        }
    }
}
