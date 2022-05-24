package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.seleniumEasy.SimpleFormDemo;
import utilities.Driver;

public class TestsSelenium {

    @BeforeMethod
    public void setup() {

        Driver.setDriver();
        SimpleFormDemo.open();
        SimpleFormDemo.closeAd();
    }

    @Test
    public void testInputFieldSeleniumEasy() {

        String expectedFullName = "Martynas";

        SimpleFormDemo.enterMessage(expectedFullName);
        SimpleFormDemo.clickShowMessageButton();
        String textMessage = SimpleFormDemo.readMessage();

        Assert.assertEquals(textMessage, expectedFullName);
    }

    @Test
    public void testTwoInputFieldsSeleniumEasy() {
        int input1 = 5;
        int input2 = 7;
        int inputSum = 12;

        SimpleFormDemo.enterValueA(Integer.toString(input1));
        SimpleFormDemo.enterValueB(Integer.toString(input2));
        SimpleFormDemo.clickGetTotalButton();
        String textTotal = SimpleFormDemo.readTotal();

        Assert.assertEquals(textTotal, Integer.toString(inputSum));
    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }
}