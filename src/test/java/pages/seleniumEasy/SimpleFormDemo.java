package pages.seleniumEasy;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Common;
import pages.Locators;
import utilities.Driver;

import java.time.Duration;

public class SimpleFormDemo {

    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public static void closeAd() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SeleniumEasy.frameAd));

        Common.clickElement(Locators.SeleniumEasy.buttonCloseAd);
    }

    public static void enterMessage(String message) {
        Common.sendKeysToElement(Locators.SeleniumEasy.inputMessage, message);
    }

    public static void clickShowMessageButton() {
        Common.clickElement(Locators.SeleniumEasy.buttonShowMessage);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.SeleniumEasy.fieldMessage);
    }

    public static void enterValueA(String value) {
        Common.sendKeysToElement(Locators.SeleniumEasy.inputValueA, value);
    }

    public static void enterValueB(String value) {
        Common.sendKeysToElement(Locators.SeleniumEasy.inputValueB, value);
    }

    public static void clickGetTotalButton() {
        Common.clickElement(Locators.SeleniumEasy.buttonGetTotal);
    }

    public static String readTotal() {
        return Common.getElementText(Locators.SeleniumEasy.fieldTotal);
    }
}
