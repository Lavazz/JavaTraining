package by.epam.javatraining.koloshych.lesson06.additional.task01;

public class EvenDigitLogic {

    public static int countEvenDigits(int number) {
        int count = 0;
        number = number > 0 ? number : -number;
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}

