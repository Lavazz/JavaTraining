package by.epam.javatraining.koloshych.maintask02.controller;


import by.epam.javatraining.koloshych.maintask02.model.*;
import org.apache.log4j.Logger;


public class FruitRunner {

    private static final Logger LOGGER = Logger.getLogger(FruitRunner.class);

    public static void main(String[] args) {

        String path = "f:/Training/Main2/src/PropertiesOfFruit";
        PropertiesReadear.parseFile(path);

        Fruit fruit = new Fruit();
        int caloricOfSalad = Salad.calculateCaloriesOfSalad(fruit);
        LOGGER.info("Caloric of salad is:  " + caloricOfSalad);

        int weightOfSalad = Salad.calculateWeightOfSalad(fruit);
        LOGGER.info("Caloric of salad is:  " + weightOfSalad);

        SortingOfFruits.SortWeightOfFruits(weightOfFruitArray);
        LOGGER.info("Sorted weight of fruit is:  " + weightOfFruitArray);

        LOGGER.info("Minimum caloric of fruit is:  " + CalculationOPropertiesOfComponent.findMinCaloric());

    }
}
