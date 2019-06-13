package by.epam.javatraining.koloshych.lesson06.additional.task04;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PolindromLogicTest {

    @Test
    public void isPolindromTrue() {
        int number=123321;
        boolean expected = true;
        Assert.assertEquals(expected, PolindromLogic.isPolindrom(number));
    }

    @Test
    public void isPolindromFalse() {
        int number=234512532;
        boolean expected = false;
        Assert.assertEquals(expected, PolindromLogic.isPolindrom(number));
    }
}