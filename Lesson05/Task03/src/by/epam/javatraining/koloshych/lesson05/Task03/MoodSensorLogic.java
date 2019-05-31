package by.epam.javatraining.koloshych.lesson05.Task03;

public class MoodSensorLogic {
    public static char identifyMood(int ratingMood) {
        char mood;
        if (ratingMood >= 0 && ratingMood <= 4) {
            mood = '(';
        } else if (ratingMood >= 5 && ratingMood <= 7) {
            mood = '|';
        } else if (ratingMood >= 8 && ratingMood <= 10) {
            mood = ')';
        }else {   //protection against an incorrect number isn't needed because numbers are generated from 0 to 10
            mood = '0';
        }
        return mood;
    }
}

