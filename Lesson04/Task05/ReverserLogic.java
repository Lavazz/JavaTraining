public class ReverserLogic {

    public static int reversOrder(int number) {
        int digit = number % 10; //7th
        number /= 10;
        result = (result + digit) * 10;

        digit = number % 10; //6th
        number /= 10;
        result = (result + digit) * 10;

        digit = number % 10; //5th
        number /= 10;
        result = (result + digit) * 10;

        digit = number % 10; //4th
        number /= 10;
        result = (result + digit) * 10;

        digit = number % 10; //third
        number /= 10;
        result = (result + digit) * 10;

        digit = number % 10; //second
        number /= 10;
        result = (result + digit) * 10;

        digit = number % 10; //first
        result += digit;
        return digit;
    }
}

