package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import com.github.javafaker.Faker;
import lippia.web.constants.PaymentMethod;
import lippia.web.constants.PhpTravelsBookingFlightConstants;
import lippia.web.constants.PhpTravelsHomeConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class PhpTravelsBookingFlightService extends ActionManager {
    private static final Faker faker = new Faker();
    private static final String firstName = faker.name().firstName();
    private static final String lastName = faker.name().lastName();
    private static final String email = faker.internet().emailAddress();
    private static final String nationality = "Argentina";
    /**
     *  you can make randoms nationalities with private static final String nationality = faker.address().country();
     *  but not all the nationalities are presents in the field
     */


    public static void completePersonalInformation() {
        setInput(PhpTravelsBookingFlightConstants.PERSONAL_INFORMATION_FIRST_NAME, firstName);
        setInput(PhpTravelsBookingFlightConstants.PERSONAL_INFORMATION_LAST_NAME, lastName);
        setInput(PhpTravelsBookingFlightConstants.PERSONAL_INFORMATION_EMAIL, email);
        setInput(PhpTravelsBookingFlightConstants.PERSONAL_INFORMATION_PHONE, faker.phoneNumber().phoneNumber());
        setInput(PhpTravelsBookingFlightConstants.PERSONAL_INFORMATION_ADDRESS, faker.address().fullAddress());
        selectCountry(nationality);
        selectNationality(nationality);
    }

    public static void completeTravellersInformation() {
        selectDropdown(getElement(PhpTravelsBookingFlightConstants.SELECT_TRAVELLERS_INFORMATION_TITLE), 1);
        setInput(PhpTravelsBookingFlightConstants.TRAVELLERS_INFORMATION_FIRST_NAME, firstName);
        setInput(PhpTravelsBookingFlightConstants.TRAVELLERS_INFORMATION_LAST_NAME, lastName);
        selectDropdown(getElement(PhpTravelsBookingFlightConstants.SELECT_TRAVELLERS_INFORMATION_NATIONALITY), nationality);
        selectDropdown(getElement(PhpTravelsBookingFlightConstants.SELECT_TRAVELLERS_INFORMATION_BIRTH_MONTH), 6);
        selectDropdown(getElement(PhpTravelsBookingFlightConstants.SELECT_TRAVELLERS_INFORMATION_BIRTH_DAY), 15);
        selectDropdown(getElement(PhpTravelsBookingFlightConstants.SELECT_TRAVELLERS_INFORMATION_BIRTH_YEAR), "1990");

        setInput(PhpTravelsBookingFlightConstants.TRAVELLERS_INFORMATION_PASSPORT, faker.internet().uuid());

        selectDropdown(getElement(PhpTravelsBookingFlightConstants.SELECT_TRAVELLERS_INFORMATION_PASSPORT_ISSUANCE_MONTH), 4);
        selectDropdown(getElement(PhpTravelsBookingFlightConstants.SELECT_TRAVELLERS_INFORMATION_PASSPORT_ISSUANCE_DAY), 15);
        selectDropdown(getElement(PhpTravelsBookingFlightConstants.SELECT_TRAVELLERS_INFORMATION_PASSPORT_ISSUANCE_YEAR), "2020");

        selectDropdown(getElement(PhpTravelsBookingFlightConstants.SELECT_TRAVELLERS_INFORMATION_PASSPORT_EXPIRY_MONTH), 7);
        selectDropdown(getElement(PhpTravelsBookingFlightConstants.SELECT_TRAVELLERS_INFORMATION_PASSPORT_EXPIRY_DAY), 20);
        selectDropdown(getElement(PhpTravelsBookingFlightConstants.SELECT_TRAVELLERS_INFORMATION_PASSPORT_EXPIRY_YEAR), "2030");
    }

    public static void selectPaymentMethod(PaymentMethod payment) {
        switch (payment) {
            case BANK_TRANSFER:
                click(PhpTravelsBookingFlightConstants.PAYMENT_METHOD_BANK_TRANSFER);
                break;
            case PAY_LATER:
                click(PhpTravelsBookingFlightConstants.PAYMENT_METHOD_PAY_LATER);
                break;
            case PAYPAL:
                click(PhpTravelsBookingFlightConstants.PAYMENT_METHOD_PAYPAL);
                break;
            case STRIPE:
                click(PhpTravelsBookingFlightConstants.PAYMENT_METHOD_STRIPE);
                break;
        }
    }

    public static void acceptTermsAndConditions() {
        WebElement element = getElement(PhpTravelsBookingFlightConstants.CHECKBOX_AGREE_TERMS_AND_CONDITIONS);

        JavascriptExecutor jse = DriverManager.getDriverInstance();
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
        jse.executeScript("arguments[0].click();", element);

    }

    public static void clickConfirmBooking() {
        WebElement element = getElement(PhpTravelsBookingFlightConstants.BUTTON_CONFIRM_BOOKING);

        JavascriptExecutor jse = DriverManager.getDriverInstance();
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
        jse.executeScript("arguments[0].click();", element);

    }

    private static void selectCountry(String country) {
        waitPresence(PhpTravelsBookingFlightConstants.PERSONAL_INFORMATION_COUNTRY);
        click(PhpTravelsBookingFlightConstants.PERSONAL_INFORMATION_COUNTRY);
        setInput(PhpTravelsBookingFlightConstants.INPUT_PERSONAL_INFORMATION_COUNTRY, country);
        click(PhpTravelsBookingFlightConstants.SELECTOR_PERSONAL_INFORMATION_COUNTRY);
    }

    private static void selectNationality(String nationality) {
        waitPresence(PhpTravelsBookingFlightConstants.PERSONAL_INFORMATION_NATIONALITY);
        click(PhpTravelsBookingFlightConstants.PERSONAL_INFORMATION_NATIONALITY);
        setInput(PhpTravelsBookingFlightConstants.INPUT_PERSONAL_INFORMATION_NATIONALITY, nationality);
        click(PhpTravelsBookingFlightConstants.SELECTOR_PERSONAL_INFORMATION_NATIONALITY);
    }

    private static void selectDropdown(WebElement element, String text) {
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(text);
    }

    private static void selectDropdown(WebElement element, int index) {
        Select dropdown = new Select(element);
        dropdown.selectByIndex(index);
    }

    public static String isDisplayedReservationNumber() {
        waitVisibility(PhpTravelsBookingFlightConstants.BOOKING_RESERVATION_NUMBER);

        return getElement(PhpTravelsBookingFlightConstants.BOOKING_RESERVATION_NUMBER).getText();

    }
}
