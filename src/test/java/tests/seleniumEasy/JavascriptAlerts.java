package tests.seleniumEasy;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class JavascriptAlerts extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.seleniumEasy.JavascriptAlerts.open();
    }

    @Test
    public void closeAlertBox() {
        pages.seleniumEasy.JavascriptAlerts.clickButtonToOpenAlertBox();
        pages.seleniumEasy.JavascriptAlerts.clickOkToCloseAlertBox();
    }
}