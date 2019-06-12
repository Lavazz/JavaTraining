package by.epam.javatraining.koloshych.lesson06.task05;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 5;
        boolean result = PrimeNumberLogic.isPrime(number);
        View.print(number, result);
    }
}
