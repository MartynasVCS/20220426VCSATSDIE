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
}
