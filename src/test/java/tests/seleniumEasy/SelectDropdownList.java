package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class SelectDropdownList {

    @BeforeMethod
    public void setup() {

        Driver.setDriver();
        pages.seleniumEasy.SelectDropdownList.open();
    }

    @Test
    public void selectDayOfWeek() {
        String expectedDay = "Wednesday";

        pages.seleniumEasy.SelectDropdownList.selectDayFromDropdown(expectedDay);
        String message = pages.seleniumEasy.SelectDropdownList.readMessage();

        Assert.assertTrue(message.contains(expectedDay));
    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }
}