package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;

public class TestsDemo {

    @Test
    public void testIfNumber4IsEven() {

        // Duomenys
        int input = 4;
        int actualRemainder;
        int expectedRemainder = 0;

        // Testo veiksmai
        actualRemainder = input % 2;

        // Palyginimas
        Assert.assertEquals(actualRemainder, expectedRemainder);
    }

    @Test
    public void testIfTimeNowIs19Hours() {

        // Duomenys
        int expectedHour = 19;
        LocalDateTime actualDateTime = LocalDateTime.now();

        // Veiksmai ???
        int actualHour = actualDateTime.getHour();

        // Palyginimas
        Assert.assertEquals(actualHour, expectedHour, "Expected: " + expectedHour + " , actual: " + actualHour);
        Assert.assertTrue(actualHour == expectedHour, "Expected: " + expectedHour + " , actual: " + actualHour);
    }
}
