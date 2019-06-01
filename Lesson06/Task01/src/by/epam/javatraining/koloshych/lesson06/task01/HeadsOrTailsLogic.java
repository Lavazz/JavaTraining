package by.epam.javatraining.koloshych.lesson06.task01;

import java.util.Random;

public class HeadsOrTailsLogic {

    public static int happenHeads(int count) {
        count = count > 0 ? count : -count;
        int countHeads = 0;
        for (int i = 0; i <= count; i++) {
            Random random = new Random();
            int result = random.nextInt(2);
            if (result == 0) {
                countHeads++;
            }
        }
        return countHeads;
    }

    public static int happenTails(int count, int countHeads) {
        count = count > 0 ? count : -count;
        return count - countHeads;
    }
}


