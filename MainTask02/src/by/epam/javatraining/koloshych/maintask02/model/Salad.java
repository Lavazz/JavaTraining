package by.epam.javatraining.koloshych.maintask02.model;

public class Salad {
    private static final int COUNT_COMPONENT = 4;

    public static int calculateCaloriesOfSalad(Fruit... fruit) {
        int calories = 0;
        for (int i = 0; i < COUNT_COMPONENT; i++) {
            calories = banana.getCaloricOfOneFruit() + kiwi.getCaloricOfOneFruit()
                    + pear.getCaloricOfOneFruit() + apple.getCaloricOfOneFruit();
        }
        return calories;
    }

    public static int calculateWeightOfSalad(Fruit... fruit) {
        int weight = 0;
        for (int i = 0; i < COUNT_COMPONENT; i++) {
            weight = banana.getWeightOfOneFruit() + kiwi.getWeightOfOneFruit()
                    + pear.getWeightOfOneFruit() + apple.getWeightOfOneFruit();
        }
        return weight;
    }

}