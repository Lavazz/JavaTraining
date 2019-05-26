public class NumberOrderLogic {
    public static boolean checkOrder(int number) {
        int a = number / 1000;
        int b = (number / 100) % 10;
        int c = (number / 10) % 10;
        int d = number % 10;
        return ((a > b) && (b > c) && (c > d)) || ((a < b) && (b < c) && (c < d));
    }
}

class PrintResult {
    public static void print(int number, boolean result) {
        String str = (result == true) ? "forms" : "does't form";
        System.out.printf("%d %s a sequence of numbers", number, str);
    }
}
