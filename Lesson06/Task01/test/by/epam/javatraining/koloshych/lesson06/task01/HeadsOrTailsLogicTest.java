package by.epam.javatraining.koloshych.lesson06.task01.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeadsOrTailsLogicTest {

    @Test
    public void happenHeadsNegative() {
        int count = -1000;
        int unexpected = -500;
        Assert.assertNotEquals(unexpected, HeadsOrTailsLogic.happenHeads(count));
    }
}