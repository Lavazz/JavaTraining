package by.epam.javatraining.koloshych.lesson05.Task03;

public class MoodSensor {
    public static void main(String[] args) {
        int ratingMood = (int) (Math.random() * 11);
        char mood = MoodSensorLogic.identifyMood(ratingMood);
        View.print(mood);
    }
}
