package by.epam.javatraining.koloshych.lesson06.task04.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddNumberLogicTest {

    @Test
    public void isEvenCorrect() {
        int n = 246826;
        boolean expected = true;
        Assert.assertEquals(expected, EvenOddNumberLogic.isEven(n));
    }

    @Test
    public void isEvenWrong() {
        int n = 246823;
        boolean expected = false;
        Assert.assertEquals(expected, EvenOddNumberLogic.isEven(n));
    }

    @Test
    public void isEvenNegetive() {
        int n = -246826;
        boolean expected = true;
        Assert.assertEquals(expected, EvenOddNumberLogic.isEven(n));
    }

    @Test
    public void isOddCorrect() {
        int n = 13579;
        boolean expected = true;
        Assert.assertEquals(expected, EvenOddNumberLogic.isOdd(n));
    }

    @Test
    public void isOddWrong() {
        int n = 1246823;
        boolean expected = false;
        Assert.assertEquals(expected, EvenOddNumberLogic.isOdd(n));
    }
}
