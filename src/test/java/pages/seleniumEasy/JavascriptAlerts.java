package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

public class JavascriptAlerts {

    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
    }

    public static void clickButtonToOpenAlertBox() {
        Common.clickElement(Locators.SeleniumEasy.JavascriptAlerts.buttonForAlertBox);
    }

    public static void clickOkToCloseAlertBox() {
        Common.acceptAlert();
    }

    public static boolean isAlertPresent() {
        return Common.isAlertPresent();
    }
}