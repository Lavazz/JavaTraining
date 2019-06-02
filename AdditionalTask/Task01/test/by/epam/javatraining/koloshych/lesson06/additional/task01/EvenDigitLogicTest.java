package by.epam.javatraining.koloshych.lesson06.additional.task01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenDigitLogicTest {

    @Test
    public void countEvenDigits() {
        int number = 26789432;
        int expected=5;
        Assert.assertEquals(expected, EvenDigitLogic.countEvenDigits(number));
    }

    @Test
    public void countEvenDigitsWithoutEven() {
        int number = 333555;
        int expected=0;
        Assert.assertEquals(expected, EvenDigitLogic.countEvenDigits(number));
    }

    @Test
    public void countEvenDigitsNegative() {
        int number = -26789432;
        int expected=5;
        Assert.assertEquals(expected, EvenDigitLogic.countEvenDigits(number));
    }
}