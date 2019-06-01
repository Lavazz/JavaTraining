package by.epam.javatraining.koloshych.lesson06.task05;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberLogicTest {

    @Test
    public void isPrimeCorrect() {
        int n = 19;
        boolean expected = true;
        Assert.assertEquals(expected, PrimeNumberLogic.isPrime(n));
    }

    @Test
    public void isPrimeWrong() {
        int n = 24;
        boolean expected = false;
        Assert.assertEquals(expected, PrimeNumberLogic.isPrime(n));
    }

    @Test
    public void isPrimeNegetive() {
        int n = -19;
        boolean expected = false;
        Assert.assertEquals(expected, PrimeNumberLogic.isPrime(n));
    }
}