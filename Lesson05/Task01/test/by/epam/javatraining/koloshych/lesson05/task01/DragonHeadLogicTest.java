package by.epam.javatraining.koloshych.lesson05.task01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DragonHeadLogicTest {

    @Test
    public void calcHeadsWrong() {
        int age = -1;
        int expected = 0;
        Assert.assertEquals(expected, DragonHeadLogic.calcHeads(age));
    }

    @Test
    public void calcHeadsNewBorn() {
        int age = 0;
        int expected = 3;
        Assert.assertEquals(expected, DragonHeadLogic.calcHeads(age));
    }

    @Test
    public void calcHeadsYong() {
        int age = 10;
        int expected = 33;
        Assert.assertEquals(expected, DragonHeadLogic.calcHeads(age));
    }

    @Test
    public void calcHeadsElder() {
        int age = 210;
        int expected = 623;
        Assert.assertEquals(expected, DragonHeadLogic.calcHeads(age));
    }

    @Test
    public void calcHeadsOld() {
        int age = 350;
        int expected = 853;
        Assert.assertEquals(expected, DragonHeadLogic.calcHeads(age));
    }

    @Test
    public void calcEye() {
        int head = 350;
        int expected = 700;
        Assert.assertEquals(expected, DragonHeadLogic.calcEye(head));
    }
}
