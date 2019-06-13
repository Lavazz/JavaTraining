package by.epam.javatraining.koloshych.maintask01.view;

import java.util.Arrays;

/**
 * This class is used by output results
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @date 09/06/2019
 */

public class View {
    public static void printArray(double[] vector) {
        System.out.println("Result is: " + Arrays.toString(vector));
    }

    public static void print(double value) {
        System.out.println("Result is: " + value);
    }

    public static void printBoolean(boolean value) {
        System.out.println("Result is: " + value);
    }

}