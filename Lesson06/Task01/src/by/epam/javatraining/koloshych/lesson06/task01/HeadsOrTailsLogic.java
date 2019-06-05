package by.epam.javatraining.koloshych.lesson06.task01;

import java.util.Random;

public class HeadsOrTailsLogic {
   static Random random = new Random();
        public static int happenHeads(int count) {
        final int VARIANTS=2;
        count = count > 0 ? count : -count;
        int countHeads = 0;
        for (int i = 0; i <= count; i++) {
            int result = random.nextInt(VARIANTS);
            if (result == 0) {
                countHeads++;
            }
        }
        return countHeads;
    }

    public static int happenTails(int count) {
        count = count > 0 ? count : -count;
        return count - happenHeads(count);
    }
}


