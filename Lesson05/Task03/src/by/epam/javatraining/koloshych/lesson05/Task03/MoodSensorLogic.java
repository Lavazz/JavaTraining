
package by.epam.javatraining.koloshych.lesson05.task03;

import java.util.Random;

public class MoodSensorLogic {

    static Random random = new Random();

    public static String identifyMood() {
        final String VERY_GOOD_MOOD = ":))))";
        final String GOOD_MOOD = ":)";
        final String NEUTRAL_MOOD = ":|";
        final String BAD_MOOD = ":(";
        int ratingMood = random.nextInt(4);
        String mood = VERY_GOOD_MOOD;
        switch (ratingMood) {
            case 1: mood = GOOD_MOOD; break;
            case 2: mood = NEUTRAL_MOOD; break;
            case 3: mood = BAD_MOOD; break;
        }
        return mood;
    }
}




