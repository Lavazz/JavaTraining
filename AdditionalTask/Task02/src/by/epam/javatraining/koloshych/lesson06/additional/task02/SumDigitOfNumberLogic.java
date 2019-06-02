package by.epam.javatraining.koloshych.lesson06.by.epam.javatraining.koloshych.lesson06.additional.task02;

public class SumDigitOfNumberLogic {
    public static int countSumODigitsOfNumber(long number) {
        int sum = 0;
        number = number > 0 ? number : -number;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
