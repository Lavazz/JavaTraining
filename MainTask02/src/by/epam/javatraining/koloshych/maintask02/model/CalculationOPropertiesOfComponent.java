package by.epam.javatraining.koloshych.maintask02.model;

public class CalculationOPropertiesOfComponent {
    public static int findMinCaloric(int... caloric) {
        double minCaloric = caloric[0];
        int minIndex = -1;
        for (int i = 0; i < caloric.length; i++) {
            //if the i-element is lower than min, it becomes min
            if (caloric[i] < minCaloric) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxSugarContent(int... sugarContent) {
        double max = sugarContent[0];
        int maxIndex = -1;
        for (int i = 0; i < sugarContent.length; i++) {
            //if the i-element is greater than max, it becomes max
            if (sugarContent[i] > max) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
