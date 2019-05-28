public class AverageValueLogic {
    private static final double numCount = 6.0;

    public static double countAvarageArithmetic(int number) {
        int digit6 = number % 10; //6th number
        number /= 10;
        int digit5 = number % 10; //5th number
        number /= 10;
        int digit4 = number % 10; //4th numbe
        number /= 10;
        int digit3 = number % 10; //third number
        number /= 10;
        int digit2 = number % 10; //second number
        number /= 10;
        int digit1 = number % 10; //first number

        return (digit1 + digit2 + digit3 + digit4 + digit5 + digit6) / numCount;
    }

    public static double countAvarageGeometric(int number) {
        int digit6 = number % 10; //6th number
        number /= 10;
        int digit5 = number % 10; //5th number
        number /= 10;
        int digit4 = number % 10; //4th numbe
        number /= 10;
        int digit3 = number % 10; //third number
        number /= 10;
        int digit2 = number % 10; //second number
        number /= 10;
        int digit1 = number % 10; //first number

        return Math.pow((digit1 * digit2 * digit3 * digit4 * digit5 * digit6), 1.0 / numCount);

    }
}


