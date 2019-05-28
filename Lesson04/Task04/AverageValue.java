public class AverageValue {
    public static void main(String[] args) {
        int number = 345678;
        double averageArithmetic = AverageValueLogic.countAvarageArithmetic(number);
        Printer.print(averageArithmetic, "arithmetic", number);
        double averageGeometric = AverageValueLogic.countAvarageGeometric(number);
        Printer.print(averageGeometric, "arithmetic", number);

    }
}