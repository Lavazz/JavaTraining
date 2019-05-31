package by.epam.javatraining.koloshych.lesson05.Task03;

import java.util.Random;

public class MoodSensor {
    public static void main(String[] args) {
        Random random = new Random();
        int ratingMood = random.nextInt(11);
        char mood = MoodSensorLogic.identifyMood(ratingMood);
        View.print(mood);
    }
}
