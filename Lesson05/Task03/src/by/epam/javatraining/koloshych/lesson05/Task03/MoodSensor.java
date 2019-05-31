package by.epam.javatraining.koloshych.lesson05.Task03;

import java.util.Random;

public class MoodSensor {
    public static void main(String[] args) {
        int min = 0;
        int max = 10;
        int diff = max - min;
        Random random = new Random();
        int ratingMood = random.nextInt(diff + 1);
        char mood = MoodSensorLogic.identifyMood(ratingMood);
        View.print(mood);
    }
}
