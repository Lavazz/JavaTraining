package by.epam.javatraining.koloshych.lesson06.task03;

public class FactorialOfNumberLogic {
    public static int countFactorial(int n) {
        int nFactorial = 1;
        if (n < 0) {
            return 0;
        }

        if (n != 0 || n != 1) {
            for (int i = 1; i <= n; i++) {
                nFactorial *= i;
            }
        }
        return nFactorial;
    }
}
