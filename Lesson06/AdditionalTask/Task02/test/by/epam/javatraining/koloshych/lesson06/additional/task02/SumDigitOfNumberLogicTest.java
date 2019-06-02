package by.epam.javatraining.koloshych.lesson06.by.epam.javatraining.koloshych.lesson06.additional.task02;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumDigitOfNumberLogicTest {

    @Test
    public void countSumODigitsOfNumber() {
        int number = 341;
        int expected=8;
        Assert.assertEquals(expected, SumDigitOfNumberLogic.countSumODigitsOfNumber(number));
    }

    @Test
    public void countSumODigitsOfNumberNegative() {
        int number = -341;
        int expected=8;
        Assert.assertEquals(expected, SumDigitOfNumberLogic.countSumODigitsOfNumber(number));
    }
    }
