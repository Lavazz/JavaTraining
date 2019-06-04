package by.epam.javatraining.koloshych.lesson06.task02;

public class NumberOrderLogic {

    public static boolean increasingSequence(int number) {
        number = number > 0 ? number : -number; //make a negative into a positive number
        boolean result = true;
        int basic = number % 10;
        while (number > 0) {
            int digit = number % 10;
            //get last digit of number
            if (basic < digit) {
                result = false;
                break;
            }
            basic = digit;
            number /= 10;
        }
        return result;
    }

    public static boolean decreasingSequence(int number) {
        number = number > 0 ? number : -number; //make a negative into a positive number
        boolean result = true;
        int basic = number % 10;
        while (number > 0) {
            int digit = number % 10; //get last digit of number
            if (basic > digit) {
                result = false;
                break;
            }
            basic = digit;
            number /= 10;
        }
        return result;
    }
}
