package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class SeleniumEasy {

        public static class SimpleFormDemo {
            public static By frameAd = By.xpath("//*[@id='at-cv-lightbox-win']");
            public static By buttonCloseAd = By.xpath("//*[@id='at-cv-lightbox-close']");
            public static By inputMessage = By.xpath("//*[@id='user-message']");
            public static By buttonShowMessage = By.xpath("//*[@id='get-input']//button");
            public static By fieldMessage = By.xpath("//*[@id='display']");
            public static By inputValueA = By.xpath("//*[@id='sum1']");
            public static By inputValueB = By.xpath("//*[@id='sum2']");
            public static By buttonGetTotal = By.xpath("//*[@id='gettotal']//button");
            public static By fieldTotal = By.xpath("//*[@id='displayvalue']");
        }

        public static class CheckboxDemo {
            public static By inputSingleCheckbox = By.xpath("//*[@id='isAgeSelected']");
            public static By fieldSingleCheckbox = By.xpath("//*[@id='txtAge']");
        }
    }
}