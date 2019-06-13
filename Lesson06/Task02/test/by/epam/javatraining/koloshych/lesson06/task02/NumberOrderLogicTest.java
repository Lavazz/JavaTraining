package by.epam.javatraining.koloshych.lesson06.task02.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOrderLogicTest {

    @Test
    public void increasingSequenceNegative() {
        int number = -35678;
        boolean expected = true;
        Assert.assertEquals(expected, NumberOrderLogic.increasingSequence(number));
    }

    @Test
    public void increasingSequenceWrong() {
        int number = 356781;
        boolean expected = false;
        Assert.assertEquals(expected, NumberOrderLogic.increasingSequence(number));
    }

    @Test
    public void increasingSequenceCorrect() {
        int number = 35678;
        boolean expected = true;
        Assert.assertEquals(expected, NumberOrderLogic.increasingSequence(number));
    }

    @Test
    public void decreasingSequenceNegative() {
        int number = -35678;
        boolean expected = false;
        Assert.assertEquals(expected, NumberOrderLogic.decreasingSequence(number));
    }

    @Test
    public void decreasingSequenceWrong() {
        int number = 35678;
        boolean expected = false;
        Assert.assertEquals(expected, NumberOrderLogic.decreasingSequence(number));
    }

    @Test
    public void decreasingSequenceCorrect() {
        int number = 987654;
        boolean expected = true;
        Assert.assertEquals(expected, NumberOrderLogic.decreasingSequence(number));
    }

}
