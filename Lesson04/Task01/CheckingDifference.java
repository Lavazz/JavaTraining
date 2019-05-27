public class CheckingDifference {
    public static void main(String[] args) {
        double a = 4.3, b = 4.3, c = 4.3;
        boolean resultSame = ChekingDifferenceLogic.checkSame(a, b, c);
        Printer.print(a, b, c, "same", resultSame);
        boolean resultDifferent = ChekingDifferenceLogic.checkDifference(a, b, c);
        Printer.print(a, b, c, "different", resultDifferent);
    }
}

