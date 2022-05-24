package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

public class CheckboxDemo {

    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }
    
    public static void clickSingleCheckbox() {
        Common.clickElement(Locators.SeleniumEasy.CheckboxDemo.inputSingleCheckbox);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.SeleniumEasy.CheckboxDemo.fieldSingleCheckbox);
    }
}