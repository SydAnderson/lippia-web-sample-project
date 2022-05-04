package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.PhpTravelsHomeService;

public class PhpTravelsHomeSteps extends PageSteps {

    @Given("The user is in home page")
    public void home() {
        PhpTravelsHomeService.navegateToWeb();
    }

    @When("The user go to {string} page")
    public void gotoFromHeader(String menu) {
        PhpTravelsHomeService.gotoHeader(menu);
    }

    @Then("The {string} page is displayed")
    public void pageIsDisplayed(String page){
        PhpTravelsHomeService.isDisplayed(page);
    }
}
