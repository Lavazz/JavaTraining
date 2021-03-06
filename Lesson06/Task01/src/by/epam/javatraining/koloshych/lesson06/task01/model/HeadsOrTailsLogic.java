package by.epam.javatraining.koloshych.lesson06.task01.model;

import java.util.Random;

public class HeadsOrTailsLogic {

    public static int happenHeads(int count) {
        Random random = new Random();
        final int VARIANTS = 2; //0- Heads, 1- Tails
        count = count > 0 ? count : -count;
        int countHeads = 0;
        for (int i = 0; i <= count; i++) {
            if (random.nextInt(VARIANTS) == 0) {
                countHeads++;
            }
        }
        return countHeads;
    }

}


