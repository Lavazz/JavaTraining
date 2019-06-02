package by.epam.javatraining.koloshych.lesson06.task02;

public class NumberOrder {
    public static void main(String[] args) {
        int number = 23456;
        boolean resultIncrease = NumberOrderLogic.increasingSequence(number);
        View.print(number, "increasing", resultIncrease);
        boolean resultDecrease = NumberOrderLogic.decreasingSequence(number);
        View.print(number, "decreasing", resultDecrease);
    }
}
