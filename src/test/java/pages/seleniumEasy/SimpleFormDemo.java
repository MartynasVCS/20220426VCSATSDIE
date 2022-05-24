package pages.seleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Common;
import utilities.Driver;

import java.time.Duration;

public class SimpleFormDemo {

    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        closeAdd();
    }

    public static void closeAdd() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='at-cv-lightbox-win']")));

        Common.clickElement(By.xpath("//*[@id='at-cv-lightbox-close']"));
    }

    public static void enterMessage(String message) {
        By locator = By.xpath("//*[@id='user-message']");
        Common.sendKeysToElement(locator, message);
    }

    public static void clickShowMessageButton() {
        By locator = By.xpath("//*[@id='get-input']//button");
        Common.clickElement(locator);
    }

    public static String readMessage() {
        By locator = By.xpath("//*[@id='display']");
        return Common.getElementText(locator);
    }

    public static void enterValueA(String value) {
        By locator = By.xpath("//*[@id='sum1']");
        Common.sendKeysToElement(locator, value);
    }

    public static void enterValueB(String value) {
        By locator = By.xpath("//*[@id='sum2']");
        Common.sendKeysToElement(locator, value);
    }

    public static void clickGetTotalButton() {
        By locator = By.xpath("//*[@id='gettotal']//button");
        Common.clickElement(locator);
    }

    public static String readTotal() {
        By locator = By.xpath("//*[@id='displayvalue']");
        return Common.getElementText(locator);
    }
}
