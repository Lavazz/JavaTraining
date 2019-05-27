public class Reverser {
    public static void main(String[] args) {
        long number = 3456789;
        long reverseNumber = ReverserLogic.reversOrder(number);
        Printer.print(reverseNumber, number);
    }
}
