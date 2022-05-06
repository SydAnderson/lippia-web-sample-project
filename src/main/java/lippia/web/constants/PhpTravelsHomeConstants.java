package lippia.web.constants;

public class PhpTravelsHomeConstants {

    public static final String HEADER_COMPANY_MENU = "xpath://div[contains(@class, 'main-menu-content')]//a[@href='company']";
    public static final String HEADER_ABOUT_US_MENU = "xpath://div[contains(@class, 'main-menu-content')]//a[contains(text(), 'About Us')]";
    public static final String HEADER_TERMS_OF_USE_MENU = "xpath://div[contains(@class, 'main-menu-content')]//a[contains(., 'Terms of Use')]";

    public static final String TITLE_ABOUT_US = "xpath://h3[contains(text(), 'About Us')]";
    public static final String TITLE_TERM_OF_USE = "xpath://h3[contains(., 'Terms of Use')]";

    public static final String MENU_SEARCH_FLIGHTS = "xpath://button[@data-bs-target='#flights']";
    public static final String RADIO_BTN_ROUND_TRIP = "id:round-trip";
    public static final String RADIO_BTN_ONE_WAY = "id:one-way";

    public static final String INPUT_FLYING_FROM = "name:from";
    public static final String INPUT_FLYING_TO = "name:to";

    public static final String AUTOCOMPLETE_FLIGHT_FIRST_RESULT = "xpath://div[contains(@data-index, '0')]";
    public static final String DATE_FLIGHT_DEPARTURE = "id:departure";
    public static final String DATE_FLIGHT_RETURN = "name:returning";

    public static final String BUTTON_SEARCH_FLIGHT = "id:flights-search";

}
