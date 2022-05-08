package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.constants.PhpTravelsBookingFlightConstants;
import lippia.web.services.PhpTravelsBookingFlightService;
import lippia.web.services.PhpTravelsSearcherService;
import org.testng.Assert;
import lippia.web.constants.PaymentMethod;
public class PhpTravelsBookingFlightSteps extends PageSteps {

    @And("The user complete the flight booking")
    public void completeTheFlightBooking(){
        PhpTravelsBookingFlightService.completePersonalInformation();
        PhpTravelsBookingFlightService.completeTravellersInformation();
        PhpTravelsBookingFlightService.selectPaymentMethod(PaymentMethod.PAY_LATER);
        PhpTravelsBookingFlightService.acceptTermsAndConditions();
        PhpTravelsBookingFlightService.clickConfirmBooking();
    }

    @Then("a reservation number is provided")
    public void aReservationNumberIsProvided() {
        Assert.assertNotNull(PhpTravelsBookingFlightService.isDisplayedReservationNumber());
    }
}
