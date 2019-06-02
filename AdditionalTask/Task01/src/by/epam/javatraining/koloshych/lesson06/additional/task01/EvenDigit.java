package by.epam.javatraining.koloshych.lesson06.additional.task01;

public class EvenDigit {
    public static void main(String[] args) {
        int number = 26789432;
        int count = EvenDigitLogic.countEvenDigits(number);
        View.print(number, count);
    }
}
