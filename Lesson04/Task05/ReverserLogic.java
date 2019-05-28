public class ReverserLogic {

    public static int reversOrder(int number) {
        int digit7 = number % 10 * 1000000; //7th number-->first
        number /= 10;
        int digit6 = number % 10 * 100000; //6th number-->second
        number /= 10;
        int digit5 = number % 10 * 10000; //5th number-->third
        number /= 10;
        int digit4 = number % 10 * 1000; //4th number-->4th
        number /= 10;
        int digit3 = number % 10 * 100; //third number-->5th
        number /= 10;
        int digit2 = number % 10 * 10; //second number-->6th
        number /= 10;
        int digit1 = number % 10; //first number-->7th

        return digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7;
    }
}

