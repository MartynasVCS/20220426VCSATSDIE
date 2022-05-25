package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

public class RadioButtonsDemo extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.seleniumEasy.RadioButtonsDemo.open();
    }

    @DataProvider(name = "radioButtonGender")
    public Object[][] radioButtonGenderFunction() {
        return new Object[][] { {"Male"},
                                {"Female"} };
    }

    @Test(dataProvider = "radioButtonGender")
    public void radioButtonGender(String gender) {
        pages.seleniumEasy.RadioButtonsDemo.clickRadioButtonByGender(gender);
        pages.seleniumEasy.RadioButtonsDemo.clickGetCheckedValue();
        String message = pages.seleniumEasy.RadioButtonsDemo.readMessage();
        Assert.assertTrue(message.contains(gender));
    }
}