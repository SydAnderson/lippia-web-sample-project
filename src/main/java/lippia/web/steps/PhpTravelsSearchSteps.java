package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.PhpTravelsHomeSearcherService;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class PhpTravelsSearchSteps extends PageSteps{

    @When("The user search a flight between two days")
    public  void searchFlight(){
        PhpTravelsHomeSearcherService.searchFlightRoundTrip();
        PhpTravelsHomeSearcherService.clickSearchFlightButton();
    }

    @Then("The search page list the available flight in those days")
    public void listOfFlightAvailable() {
        Assert.assertTrue(PhpTravelsHomeSearcherService.isFlightFound());
    }
}
