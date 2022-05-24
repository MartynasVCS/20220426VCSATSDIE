package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class CheckboxDemo extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.seleniumEasy.CheckboxDemo.open();
    }

    @Test
    public void singleCheckbox() {
        String expectedMessage = "Success - Check box is checked";

        pages.seleniumEasy.CheckboxDemo.clickSingleCheckbox();
        String actualMessage = pages.seleniumEasy.CheckboxDemo.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}