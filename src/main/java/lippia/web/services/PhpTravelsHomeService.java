package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.PhpTravelsHomeConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;


public class PhpTravelsHomeService extends ActionManager {
    public static void navegateToWeb(){
        navigateTo(PropertyManager.getProperty("php.travels.url"));
    }


    public static void gotoHeader(String menu) {
        switch (menu) {
            case "About Us":
                PhpTravelsHomeService.gotoAboutUs();
                break;
            case "Terms of Use":
                PhpTravelsHomeService.gotoTermsOfUse();
                break;
            default:
                System.out.println("MenuNotFoundException");
        }
    }

    private static void gotoAboutUs() {
        //scroll for css bug in show menu
        scroll();
        waitPresence((PhpTravelsHomeConstants.HEADER_COMPANY_MENU));

        Actions action = new Actions(DriverManager.getDriverInstance());
        WebElement we = getElement(PhpTravelsHomeConstants.HEADER_COMPANY_MENU);
        action.moveToElement(we).moveToElement(getElement((PhpTravelsHomeConstants.HEADER_ABOUT_US_MENU))).click().build().perform();
    }

    private static void gotoTermsOfUse(){
        //scroll for css bug in show menu
        scroll();
        waitPresence((PhpTravelsHomeConstants.HEADER_COMPANY_MENU));

        Actions action = new Actions(DriverManager.getDriverInstance());
        WebElement we = getElement(PhpTravelsHomeConstants.HEADER_COMPANY_MENU);
        action.moveToElement(we).moveToElement(getElement(PhpTravelsHomeConstants.HEADER_TERMS_OF_USE_MENU)).click().build().perform();
}


    public static void isDisplayed(String page) {
        switch (page) {
            case "About Us":
                waitVisibility(PhpTravelsHomeConstants.TITLE_ABOUT_US);
                Assert.assertTrue(isVisible(PhpTravelsHomeConstants.TITLE_ABOUT_US));
                break;
            case "Terms of Use":
                waitVisibility(PhpTravelsHomeConstants.TITLE_TERM_OF_USE);
                Assert.assertTrue(isVisible(PhpTravelsHomeConstants.TITLE_TERM_OF_USE));
                break;
        }
    }

    private static void scroll(){
        JavascriptExecutor jse = DriverManager.getDriverInstance();
        jse.executeScript("scroll(0, 50)");
    }

    public static void acceptCookies() {
        click(PhpTravelsHomeConstants.BUTTON_COOKIES_GOT_IT);
    }
}
