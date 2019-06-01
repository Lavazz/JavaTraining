package by.epam.javatraining.koloshych.lesson06.task03;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialOfNumberLogicTest {

    @Test
    public void countFactorialZero() {
        int n=0;
       int expected =1;
        Assert.assertEquals(expected, FactorialOfNumberLogic.countFactorial(n));
    }
    @Test
    public void countFactorialOne() {
        int n=1;
        int expected =1;
        Assert.assertEquals(expected, FactorialOfNumberLogic.countFactorial(n));
    }
    @Test
    public void countFactorialЗositive() {
        int n=4;
        int expected =24;
        Assert.assertEquals(expected, FactorialOfNumberLogic.countFactorial(n));
    }
    @Test
    public void countFactorialNegative() {
        int n=-4;
        int expected =24;
        Assert.assertEquals(expected, FactorialOfNumberLogic.countFactorial(n));
    }

}