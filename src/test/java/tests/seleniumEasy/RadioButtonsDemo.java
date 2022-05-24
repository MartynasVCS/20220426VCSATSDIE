package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class RadioButtonsDemo extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.seleniumEasy.RadioButtonsDemo.open();
    }

    @Test
    public void radioButtonMale() {
        String genderMale = "Male";
        String genderFemale = "Female";

        pages.seleniumEasy.RadioButtonsDemo.clickRadioButtonByGender(genderMale);
        pages.seleniumEasy.RadioButtonsDemo.clickGetCheckedValue();
        String message = pages.seleniumEasy.RadioButtonsDemo.readMessage();
        Assert.assertTrue(message.contains(genderMale));

        pages.seleniumEasy.RadioButtonsDemo.clickRadioButtonByGender(genderFemale);
        pages.seleniumEasy.RadioButtonsDemo.clickGetCheckedValue();
        message = pages.seleniumEasy.RadioButtonsDemo.readMessage();
        Assert.assertTrue(message.contains(genderFemale));
    }
}