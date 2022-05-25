package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Common {

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void selectOptionByValue(By locator, String value) {
        WebElement webElement = getElement(locator);
        Select selectElement = new Select(webElement);
        selectElement.selectByValue(value);
    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static List<Boolean> getSelectedStatusForCheckboxesByLocator(By locator) {
        // Gauname elementų sarašą
        List<WebElement> elements = Common.getElements(locator);

        // Sukuriame sarašą kuriame saugosime Boolean reikšmes apie tai ar elementas pažymėtas ar ne
        List<Boolean> statusList = new ArrayList(Arrays.asList());

        // Tikriname visus elementus
        for (WebElement element : elements) {

            // Išsaugome elemento pažymėjimo reikšmę
            statusList.add(element.isSelected());
        }

        // Gražinam sarašą
        return statusList;
    }
}
