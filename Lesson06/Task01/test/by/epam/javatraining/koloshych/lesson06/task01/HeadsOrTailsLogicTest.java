package by.epam.javatraining.koloshych.lesson06.task01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeadsOrTailsLogicTest {

    @Test
    public void happenHeads() {
        int count=1000;
        int expected =500;
        Assert.assertEquals(expected, HeadsOrTailsLogic.happenHeads(count));
    }

    @Test
    public void happenTails() {
        int count=1000;
        int countHeads =425;
        int expected =575;
        Assert.assertEquals(expected, HeadsOrTailsLogic.happenTails(count, countHeads));
    }

    @Test
    public void happenTailsNegative() {
        int count=-1000;
        int countHeads =425;
        int expected =575;
        Assert.assertEquals(expected, HeadsOrTailsLogic.happenTails(count, countHeads));
    }
}