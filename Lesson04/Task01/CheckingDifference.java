public class CheckingDifference {
    public static void main(String[] args) {
        double a = 4.3, b = 4.3, c = 4.3;
        boolean result = ChekingDifferenceLogic.checkDifference(a, b, c);
        String str = (result == true) ? " same" : " difference";
        Printer.print(a, b, c, str);
    }
}

