public class RingSpaceLogic {
    public static double countSpace(double r1, double r2) {
        return 3.14 * (r1 * r1 - r2 * r2);
    }
}

class Printer {
    public static void print(double space) {
        System.out.printf("Space ring is : %.2f ", space);
    }
}