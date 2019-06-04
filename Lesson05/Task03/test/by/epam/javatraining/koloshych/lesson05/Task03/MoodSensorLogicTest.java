package by.epam.javatraining.koloshych.lesson05.task03;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoodSensorLogicTest {

    @Test
    public void identifyMoodGood() {
        int ratingMood = 1;
        String expected = ":)";
        Assert.assertEquals(expected, MoodSensorLogic.identifyMood());
    }
}