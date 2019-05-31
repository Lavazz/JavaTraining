package by.epam.javatraining.koloshych.lesson05.Task03;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoodSensorLogicTest {

    @Test
    public void identifyMoodGood() {
        int ratingMood= 10;
           char expected = ')';
            Assert.assertEquals(expected, MoodSensorLogic.identifyMood(ratingMood));
        }

    @Test
    public void identifyMoodNormal() {
        int ratingMood= 6;
        char expected = '|';
        Assert.assertEquals(expected, MoodSensorLogic.identifyMood(ratingMood));
    }
    @Test
    public void identifyMoodBad() {
        int ratingMood= 2;
        char expected = '(';
        Assert.assertEquals(expected, MoodSensorLogic.identifyMood(ratingMood));
    }
    @Test
    public void identifyMoodWrong() {
        int ratingMood= -10;
        char expected = '0';
        Assert.assertEquals(expected, MoodSensorLogic.identifyMood(ratingMood));
    }
    }
