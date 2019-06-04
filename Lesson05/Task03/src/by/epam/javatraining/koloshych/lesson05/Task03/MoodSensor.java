package by.epam.javatraining.koloshych.lesson05.task03;

public class MoodSensor {
    public static void main(String[] args) {
        String mood = MoodSensorLogic.identifyMood();
        View.print(mood);
    }
}


