public class Reverser {
    public static void main(String[] args) {
        int number = 3456789;
        int reverseNumber = ReverserLogic.reversOrder(number);
        Printer.print(reverseNumber, number);
    }
}
