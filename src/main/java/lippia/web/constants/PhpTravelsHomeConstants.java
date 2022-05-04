package lippia.web.constants;

public class PhpTravelsHomeConstants {

    public static final String HEADER_COMPANY_MENU = "xpath://div[contains(@class, 'main-menu-content')]//a[@href='company']";
    public static final String HEADER_ABOUT_US_MENU = "xpath://div[contains(@class, 'main-menu-content')]//a[contains(text(), 'About Us')]";
    public static final String HEADER_TERMS_OF_USE_MENU = "xpath://div[contains(@class, 'main-menu-content')]//a[contains(., 'Terms of Use')]";

    public static final String TITLE_ABOUT_US = "xpath://h3[contains(text(), 'About Us')]";
    public static final String TITLE_TERM_OF_USE = "xpath://h3[contains(., 'Terms of Use')]";
}
