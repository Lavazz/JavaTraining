public class NumberOrderLogic {
    public static boolean increasingSequence(int number) {
        int digit4 = number % 10; //4th number
        number /= 10;
        int digit3 = number % 10; //third number
        number /= 10;
        int digit2 = number % 10; //second number
        number /= 10;
        int digit1 = number % 10; //first number

        return (digit1 < digit2) && (digit2 < digit3) && (digit3 < digit4);
    }

    public static boolean decreasingSequence(int number) {
        int digit4 = number % 10; //4th number
        number /= 10;
        int digit3 = number % 10; //third number
        number /= 10;
        int digit2 = number % 10; //second number
        number /= 10;
        int digit1 = number % 10; //first number

        return (digit1 > digit2) && (digit2 > digit3) && (digit3 > digit4);
    }
}
