package by.epam.javatraining.koloshych.lesson06.task03.model;

public class FactorialOfNumberLogic {
    public static int countFactorial(int n) {
        int nFactorial = 1;
        if (n < 0) {
            return 0;
        }
        for (int i = 2; i <= n; i++) {
            nFactorial *= i;
        }

        return nFactorial;
    }
}
