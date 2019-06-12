package by.epam.javatraining.koloshych.lesson06.task04;

public class EvenOddNumberLogic {
    public static boolean isEven(int number) {
        boolean result = true;
        while (number > 0) {
            if ((number % 10) % 2 != 0) {
                result = false;
                break;
            }
            number /= 10;
        }
        return result;
    }

    public static boolean isOdd(int number) {
        boolean result = true;
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                result = false;
                break;
            }
            number /= 10;
        }
        return result;
    }
}
