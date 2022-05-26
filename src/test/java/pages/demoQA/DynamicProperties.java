package pages.demoQA;

import pages.Common;
import pages.Locators;

public class DynamicProperties {

    public static void open() {
        Common.openUrl("https://demoqa.com/dynamic-properties");
    }

    public static void clickButtonEnabledAfter() {
        Common.waitForElementToBeClickable(Locators.DemoQA.DynamicProperties.buttonEnableAfter);
        Common.clickElement(Locators.DemoQA.DynamicProperties.buttonEnableAfter);
    }
}