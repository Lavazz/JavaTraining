package by.epam.javatraining.koloshych.maintask02.model;

import java.util.Arrays;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class SortingOfFruits {
    public static void SortWeightOfFruits(int... weightOfFruits) {

        for (int i = 1; i < weightOfFruits.length; i++) {
            int currElem = weightOfFruits[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && weightOfFruits[prevKey] > currElem) {
                weightOfFruits[prevKey + 1] = weightOfFruits[prevKey];
                weightOfFruits[prevKey] = currElem;
                prevKey--;
            }
        }
        LOGGER.info("Sorted weight is: " + Arrays.toString(weightOfFruits));
    }
}
