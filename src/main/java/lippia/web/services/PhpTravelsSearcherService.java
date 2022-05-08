package lippia.web.services;

import com.crowdar.core.actions.ActionManager;

import lippia.web.constants.PhpTravelsHomeConstants;
import lippia.web.constants.PhpTravelsListConstants;
import lippia.web.constants.TypeOfFlight;


public class PhpTravelsSearcherService extends ActionManager {
    /**
     * complete the fields to search for a roundtrip flight
     */
    public static void searchFlightRoundTrip() {
        clickMenuFlight();
        flightFromTo("Buenos Aires", "Bern");
        selectTypeOfFlight(TypeOfFlight.ROUND_TRIP);
        departureDate("10-08-2022");
        returnDate("25-08-2022");
    }
    /**
     * complete the fields to search for a one way flight
     */
    public static void searchFlightOneWay() {
        clickMenuFlight();
        selectTypeOfFlight(TypeOfFlight.ONE_WAY);
        flightFromTo("Buenos Aires", "Bern");
        departureDate("10-08-2022");
    }

    /**
     * Returns true if results were found for the search query
     * @return boolean
     */
    public static boolean isFlightFound() {
        waitPresence(PhpTravelsListConstants.SEARCH_FLIGHT_FOUND);
        return isVisible(PhpTravelsListConstants.SEARCH_FLIGHT_FOUND);
    }

    public static void selectFirstFlightResult() {
        if (isFlightFound()){
            click(PhpTravelsListConstants.FIRST_RESULT_LIST_FLIGHT);
        } else{
            throw new Error("Not flight available");
        }
    }

    public static void clickSearchFlightButton() {
        click(PhpTravelsHomeConstants.BUTTON_SEARCH_FLIGHT);
    }

    /**
     *  This method fills in the destination fields of the flights
     * @param from where the flight begins
     * @param to flight destination
     */
    private static void flightFromTo(String from, String to) {
        setInput(PhpTravelsHomeConstants.INPUT_FLYING_FROM, from);
        click(PhpTravelsHomeConstants.AUTOCOMPLETE_FLIGHT_FIRST_RESULT);
        setInput(PhpTravelsHomeConstants.INPUT_FLYING_TO, to);
        click(PhpTravelsHomeConstants.AUTOCOMPLETE_FLIGHT_FIRST_RESULT);
    }


    private static void departureDate(String date) {
        setInput(PhpTravelsHomeConstants.DATE_FLIGHT_DEPARTURE, date, true, true);
    }

    private static void returnDate(String date) {
        setInput(PhpTravelsHomeConstants.DATE_FLIGHT_RETURN, date, true, true);
    }

    private static void clickMenuFlight() {
        click(PhpTravelsHomeConstants.MENU_SEARCH_FLIGHTS);
    }

    /**
     * Select type of flight between roundtrip and one way
     * @param typeOfFlight enum containing the available flight types
     */
    private static void selectTypeOfFlight(TypeOfFlight typeOfFlight) {
        switch (typeOfFlight) {
            case ROUND_TRIP:
                click(PhpTravelsHomeConstants.RADIO_BTN_ROUND_TRIP);
                break;
            case ONE_WAY:
                click(PhpTravelsHomeConstants.RADIO_BTN_ONE_WAY);
                break;
        }
    }


}

