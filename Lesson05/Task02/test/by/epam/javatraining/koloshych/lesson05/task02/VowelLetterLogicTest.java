package by.epam.javatraining.koloshych.lesson05.task02;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelLetterLogicTest {

    @Test
    public void isVowelWrong() {
        char letter = 'r';
        boolean expected = false;
        Assert.assertEquals(expected, VowelLetterLogic.isVowel(letter));
    }

    @Test
    public void isVowelUpperLetter() {
        char letter = 'O';
        boolean expected = true;
        Assert.assertEquals(expected, VowelLetterLogic.isVowel(letter));
    }

    @Test
    public void isVowelLowerLetter() {
        char letter = 'i';
        boolean expected = true;
        Assert.assertEquals(expected, VowelLetterLogic.isVowel(letter));
    }
}