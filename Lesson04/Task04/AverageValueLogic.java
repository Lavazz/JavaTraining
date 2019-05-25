public class AverageValueLogic {

    public static void splitNumber(int number) {
        int a, b, c, d, e, f;
        a = number / 100000;
        b = number / 10000 % 10;
        c = number / 1000 % 10;
        d = number / 100 % 10;
        e = number / 10 % 10;
        f = number % 10;

        countAvarageArithmetic(a, b, c, d, e, f, number);
        countAvarageGeometric(a, b, c, d, e, f, number);
    }

    public static void countAvarageArithmetic(int a, int b, int c, int d, int e, int f, int number) {
        double averageArithmetic = (a + b + c + d + e + f) / 6;
        PrintAverage.print(averageArithmetic, "arithmetic", number);
    }

    public static double countAvarageGeometric(int a, int b, int c, int d, int e, int f, int number) {
        double averageGeometric = Math.pow((a * b * c * d * e * f), 1.0 / 6.0);
        PrintAverage.print(averageGeometric, "arithmetic", number);
        return averageGeometric;
    }
}

class PrintAverage {
    public static void print(double average, String s, int number) {
        System.out.printf("\nAverage %s of number %d is %.2f", s, number, average);
    }
}