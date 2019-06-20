package by.epam.javatraining.koloshych.maintask02.model;

public class Fruit {

    private String fruitName;
    private int weightOfOneFruit;
    private int caloricOfOneFruit;
    private int sugarContent;


    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getWeightOfOneFruit() {
        return weightOfOneFruit;
    }

    public void setWeightOfOneFruit(int weightOfOneFruit) {
        this.weightOfOneFruit = weightOfOneFruit;
    }

    public int getCaloricOfOneFruit() {
        return caloricOfOneFruit;
    }

    public void setCaloricOfHundredGramm(int caloricOfHundredGrams) {
        this.caloricOfOneFruit = caloricOfHundredGrams;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }
}
