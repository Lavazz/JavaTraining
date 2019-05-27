public class ReverserLogic {

    public static long reversOrder(long number) {
        long digit7 = number % 10 * 1000000; //7th number-->first
        number /= 10;
        long digit6 = number % 10 * 100000; //6th number-->second
        number /= 10;
        long digit5 = number % 10 * 10000; //5th number-->third
        number /= 10;
        long digit4 = number % 10 * 1000; //4th number-->4th
        number /= 10;
        long digit3 = number % 10 * 100; //third number-->5th
        number /= 10;
        long digit2 = number % 10 * 10; //second number-->6th
        number /= 10;
        long digit1 = number % 10; //first number-->7th

        return digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7;
    }
}

