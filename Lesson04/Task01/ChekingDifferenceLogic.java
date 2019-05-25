class ChekingDifferenceLogic{
    public static boolean checkDifference(double a, double b, double c) {
        return (a == b) && (b == c);

    }
}

class Printer {
    public static void print(double a, double b, double c, String str) {
        System.out.printf("Values %.2f, %.2f, %.2f are %s", a, b, c, str);
    }
}