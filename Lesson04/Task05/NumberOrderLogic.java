public class NumberOrderLogic {
    public static void splitNumber(int number) {
        int a = number / 1000;
        int b = (number / 100) % 10;
        int c = (number / 10) % 10;
        int d = number % 10;
        checkOrder(a, b, c, d, number);
    }

    public static void checkOrder(int a, int b, int c, int d, int number) {
        boolean result = ((a > b) && (b > c) && (c > d)) || ((a < b) && (b < c) && (c < d));
        PrintResult.print(number, result);
    }
}

class PrintResult {
    public static void print(int number, boolean result) {
        String str = (result == true) ? "forms" : "does't form";
        System.out.printf("%d %s a sequence of numbers", number, str);
    }
}
