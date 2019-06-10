package by.epam.javatraining.koloshych.maintask01.additionaltask;

/**
 * This class is used by output results
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @date 08/06/2019
 */

public class View {
    public static void print(double value) {
        System.out.println("Result is: " + value);
    }

    public static void print(boolean value) {
        System.out.println("Result is: " + value);
    }

    public static void print(String value) {
        System.out.println("Result is: " + value);
    }

    public static void print(double[][] value) {
        for (int i = 0; i < value.length; i++) {
            System.out.println();
            for (int j = 0; j < value.length; j++) {
                System.out.print(value[i][j] + " ");
            }
        }
    }
}
