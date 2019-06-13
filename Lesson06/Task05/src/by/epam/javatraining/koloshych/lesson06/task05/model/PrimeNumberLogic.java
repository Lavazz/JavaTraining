package by.epam.javatraining.koloshych.lesson06.task05.model;

public class PrimeNumberLogic {
    public static boolean isPrime(int number) {
        boolean result = true;
        if(number<1){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
