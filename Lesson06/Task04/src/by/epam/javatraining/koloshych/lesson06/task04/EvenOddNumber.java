package by.epam.javatraining.koloshych.lesson06.task04;

public class EvenOddNumber {
    public static void main(String[] args) {
        int number = 246826;
        boolean evenResult = EvenOddNumberLogic.isEven(number);
        boolean oddResult = EvenOddNumberLogic.isOdd(number);
        View.print(number, "increasing", evenResult);
        View.print(number, "decreasing", oddResult);
    }
}


