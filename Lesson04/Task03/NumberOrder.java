public class NumberOrder {
    public static void main(String[] args) {
        int number = 3589;
        boolean resultIncrease = NumberOrderLogic.increasingSequence(number);
        Printer.print(number, "increasing", resultIncrease);
        boolean resultDecrease = NumberOrderLogic.decreasingSequence(number);
        Printer.print(number, "decreasing", resultDecrease);
    }
}
