package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class CheckboxDemo {

    @BeforeMethod
    public void setup() {

        Driver.setDriver();
        pages.seleniumEasy.CheckboxDemo.open();
    }

    @Test
    public void singleCheckbox() {
        String expectedMessage = "Success - Check box is checked";

        pages.seleniumEasy.CheckboxDemo.clickSingleCheckbox();
        String actualMessage = pages.seleniumEasy.CheckboxDemo.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }
}