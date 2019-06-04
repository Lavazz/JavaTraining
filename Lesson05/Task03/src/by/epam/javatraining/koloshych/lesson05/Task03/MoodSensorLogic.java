package by.epam.javatraining.koloshych.lesson05.task03;

import java.util.Random;

public class MoodSensorLogic {
    public static final String VERY_GOOD_MOOD = ":))))";
    public static final String GOOD_MOOD = ":)";
    public static final String NETRAL_MOOD = ":|";
    public static final String BAD_MOOD = ":(";

    public static String identifyMood() {
        Random random = new Random();
        int ratingMood = random.nextInt(4);
        String mood = VERY_GOOD_MOOD;
        switch (ratingMood) {
            case 1: mood = GOOD_MOOD; break;
            case 2: mood = NETRAL_MOOD; break;
            case 3: mood = BAD_MOOD; break;
        }
        return mood;
    }
}



