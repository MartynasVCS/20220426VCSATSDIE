package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class TestsClasswork {

    @Test
    public void testIfNumber995DividesBy3WithoutRemainder() {
        int input = 995;
        int expectedRemainder = 0;

        int actualRemainder = input % 3;

        Assert.assertEquals(actualRemainder, expectedRemainder);
    }

    @Test
    public void testIfTodayIsWednesday() {

        DayOfWeek expectedDay = DayOfWeek.WEDNESDAY;
        LocalDateTime actualDate = LocalDateTime.now();

        DayOfWeek actualDay = actualDate.getDayOfWeek();

        Assert.assertEquals(actualDay, expectedDay);
    }

    @Test
    public void testWaitFor5Seconds() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    @Test
    public void testCountOfEvenNumbersBetween1And10() {
        int actualEvenNumbersCount = 0;
        int expectedEvenNumbersCount = 4;

        for (int i = 1; i <= 10; i++) {

            // Checking if number is even
            if (i % 2 == 0) {
                actualEvenNumbersCount++;
            }
        }

        Assert.assertEquals(actualEvenNumbersCount, expectedEvenNumbersCount);
    }
}
