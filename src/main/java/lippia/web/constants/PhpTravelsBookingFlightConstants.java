package lippia.web.constants;

public class PhpTravelsBookingFlightConstants {
    public static final String PERSONAL_INFORMATION_FIRST_NAME = "xpath://div[@class='contact-form-action']//input[contains(@name, 'firstname')]";
    public static final String PERSONAL_INFORMATION_LAST_NAME = "xpath://div[@class='contact-form-action']//input[contains(@name, 'lastname')]";
    public static final String PERSONAL_INFORMATION_EMAIL = "xpath://div[@class='contact-form-action']//input[contains(@name, 'email')]";
    public static final String PERSONAL_INFORMATION_PHONE = "xpath://div[@class='contact-form-action']//input[contains(@name, 'phone')]";
    public static final String PERSONAL_INFORMATION_ADDRESS = "xpath://div[@class='contact-form-action']//input[contains(@name, 'address')]";

    public static final String PERSONAL_INFORMATION_COUNTRY = "xpath://span[contains(@id, 'select2-country')]";
    public static final String INPUT_PERSONAL_INFORMATION_COUNTRY = "xpath://input[contains(@class, 'select2-search')]";
    public static final String SELECTOR_PERSONAL_INFORMATION_COUNTRY = "xpath://ul[contains(@id, 'select2-country')]/li[1]";

    public static final String PERSONAL_INFORMATION_NATIONALITY = "xpath://span[contains(@id, 'select2-nationality')]";
    public static final String INPUT_PERSONAL_INFORMATION_NATIONALITY = "xpath://input[contains(@class, 'select2-search')]";
    public static final String SELECTOR_PERSONAL_INFORMATION_NATIONALITY = "xpath://ul[contains(@id, 'select2-nationality')]/li[1]";

    public static final String SELECT_TRAVELLERS_INFORMATION_TITLE = "xpath://select[@name='title_1']";
    public static final String TRAVELLERS_INFORMATION_FIRST_NAME = "xpath://input[@name='firstname_1']";
    public static final String TRAVELLERS_INFORMATION_LAST_NAME = "xpath://input[@name='lastname_1']";
    public static final String SELECT_TRAVELLERS_INFORMATION_NATIONALITY = "xpath://select[@name='nationality_1']";
    public static final String SELECT_TRAVELLERS_INFORMATION_BIRTH_MONTH = "xpath://select[@name='dob_month_1']";
    public static final String SELECT_TRAVELLERS_INFORMATION_BIRTH_DAY = "xpath://select[@name='dob_day_1']";
    public static final String SELECT_TRAVELLERS_INFORMATION_BIRTH_YEAR = "xpath://select[@name='dob_year_1']";

    public static final String TRAVELLERS_INFORMATION_PASSPORT = "xpath://input[@name='passport_1']";
    public static final String SELECT_TRAVELLERS_INFORMATION_PASSPORT_ISSUANCE_MONTH = "xpath://select[@name='passport_issuance_month_1']";
    public static final String SELECT_TRAVELLERS_INFORMATION_PASSPORT_ISSUANCE_DAY = "xpath://select[@name='passport_issuance_day_1']";
    public static final String SELECT_TRAVELLERS_INFORMATION_PASSPORT_ISSUANCE_YEAR = "xpath://select[@name='passport_issuance_year_1']";

    public static final String SELECT_TRAVELLERS_INFORMATION_PASSPORT_EXPIRY_MONTH = "xpath://select[@name='passport_month_1']";
    public static final String SELECT_TRAVELLERS_INFORMATION_PASSPORT_EXPIRY_DAY = "xpath://select[@name='passport_day_1']";
    public static final String SELECT_TRAVELLERS_INFORMATION_PASSPORT_EXPIRY_YEAR = "xpath://select[@name='passport_year_1']";

    public static final String PAYMENT_METHOD_BANK_TRANSFER = "id:gateway_bank-transfer";
    public static final String PAYMENT_METHOD_PAY_LATER = "id:gateway_pay-later";
    public static final String PAYMENT_METHOD_PAYPAL = "id:gateway_paypal";
    public static final String PAYMENT_METHOD_STRIPE = "id:gateway_stripe";

    public static final String CHECKBOX_AGREE_TERMS_AND_CONDITIONS = "xpath://div[@class='input-box']//input[@id='agreechb']";

    public static final String BUTTON_CONFIRM_BOOKING = "id:booking";

    public static final String BOOKING_RESERVATION_NUMBER = "xpath://h3[@class='title']//strong";

}
