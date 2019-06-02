package by.epam.javatraining.koloshych.lesson06.by.epam.javatraining.koloshych.lesson06.additional.task02;

public class SumDigitOfNumber {
    public static void main(String[] args) {
        int number = 1234;
        int count = SumDigitOfNumberLogic.countSumODigitsOfNumber(number);
        View.print(number, count);
    }
}
