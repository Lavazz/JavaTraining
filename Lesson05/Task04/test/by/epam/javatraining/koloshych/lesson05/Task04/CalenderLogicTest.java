package by.epam.javatraining.koloshych.lesson05.Task04;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalenderLogicTest {

    @Test
    public void giveNewDayWrong() {
        int day = 42, month = 4, year = 1864;
        int expected = 0;
        Assert.assertEquals(expected, CalenderLogic.giveNewDay(day, month, year));
    }

    @Test
    public void giveNewDayLast() {
        int day = 31, month = 3, year = 1864;
        int expected = 1;
        Assert.assertEquals(expected, CalenderLogic.giveNewDay(day, month, year));
    }

    @Test
    public void giveNewMonthWrong() {
        int newDay = 25, month = 15;
        int expected = 0;
        Assert.assertEquals(expected, CalenderLogic.giveNewMonth(newDay, month));
    }

    @Test
    public void giveNewMonthNext() {
        int newDay = 1, month = 1;
        int expected = 2;
        Assert.assertEquals(expected, CalenderLogic.giveNewMonth(newDay, month));
    }

    @Test
    public void giveNewMonthCorrect() {
        int newDay = 5, month = 1;
        int expected = 1;
        Assert.assertEquals(expected, CalenderLogic.giveNewMonth(newDay, month));
    }

    @Test
    public void giveNewYear() {
        int newMonth = 10, year = 1570;
        int expected = 1570;
        Assert.assertEquals(expected, CalenderLogic.giveNewYear(newMonth, year));
    }

    @Test
    public void giveNewYearNext() {
        int newMonth = 1, year = 1570;
        int expected = 1571;
        Assert.assertEquals(expected, CalenderLogic.giveNewYear(newMonth, year));
    }
}
