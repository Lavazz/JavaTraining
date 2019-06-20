package by.epam.javatraining.koloshych.maintask02.model;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class PropertiesReadear {

    private static final Logger LOGGER = Logger.getLogger(PropertiesReadear.class);
    private static final String DELIMITER = " +";
    private static final String FRUIT_BANANA = "banana";
    private static final String FRUIT_KIWI = "kiwi";
    private static final String FRUIT_PEAR = "pear";
    private static final String FRUIT_APPLE = "apple";

    public static FruitArray parseFile(String path) {

        FruitArray fruits = new FruitArray();

        Scanner scanner;
        try {
            scanner = new Scanner(path);
            scanner.useDelimiter(":\n");

            while (scanner.hasNextLine()) {
                String fruitString = scanner.nextLine();
                Fruit fruit = parseFruit(fruitString);
                fruits.add(fruit);
            }
            scanner.close();
        } catch (IndexOutOfBoundsException e) {
            LOGGER.error("Check the file!");
        }

        return fruits;
    }

    private static Fruit parseFruit(String fruitString) {
        String[] tokens = fruitString.split(DELIMITER);
        String nameFruit = tokens[0];
        int weightOfOneFruit = Integer.parseInt(tokens[1]);
        int caloricOfOneFruit = Integer.parseInt(tokens[2]);
        int sugarContent = Integer.parseInt(tokens[3]);


        if (nameFruit == FRUIT_BANANA) {
            return new Banana(nameFruit, weightOfOneFruit, caloricOfOneFruit, sugarContent);
        } else if (nameFruit == FRUIT_KIWI) {
            return new Kiwi(nameFruit, weightOfOneFruit, caloricOfOneFruit, sugarContent);
        } else if (nameFruit == FRUIT_APPLE) {
            return new Apple(nameFruit, weightOfOneFruit, caloricOfOneFruit, sugarContent);
        } else if (nameFruit == FRUIT_PEAR) {
            return new Pear(nameFruit, weightOfOneFruit, caloricOfOneFruit, sugarContent);
        } else {
            return null;
        }
    }
}

