package by.epam.javatraining.koloshych.lesson06.additional.task04;

public class PolindromLogic {

    public static boolean isPolindrom(int number) {
        number = number > 0 ? number : -number;
        int tempNumber = number;
        int reverseDigit = 0;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            reverseDigit = reverseDigit * 10 + digit;
            tempNumber /= 10;
        }

        return reverseDigit == number;
    }
}
