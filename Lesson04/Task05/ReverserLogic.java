public class ReverserLogic {

    public static long reversOrder(long number) {
        long a, b, c, d, e, f, g;
        a = number / 1000000;
        b = number / 100000 % 10;
        c = number / 10000 % 10;
        d = number / 1000 % 10;
        e = number / 100 % 10;
        f = number / 10 % 10;
        g = number % 10;
        return g * 1000000 + f * 100000 + e * 10000 + d * 1000 + c * 100 + b * 10 + a;
    }
}

class Printer {
    public static void print(long orderedNumber, long number) {
        System.out.printf("\nReverse order of number %d is %d", number, orderedNumber);
    }
}