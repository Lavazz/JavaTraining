package by.epam.javatraining.koloshych.maintask02.model;

public class FruitArray {
    private Fruit[] fruits;
    private int size;


    public FruitArray() {
        fruits = new Fruit[4];
    }

    public FruitArray(int capacity) {
        fruits = new Fruit[capacity];
        size = capacity;
    }

    public void add(Fruit value) {
        if (size == fruits.length) {
            increaseArray();
        }
        fruits[size] = value;
        size++;
    }

    public Fruit get(int index) {
        checkIndex(index);
        return fruits[index];
    }

    public void set(int index, Fruit value) {
        checkIndex(index);
        fruits[index] = value;
    }


    private void increaseArray() {
        Fruit[] newArray = new Fruit[fruits.length * 2];
        for (int i = 0; i < size - 1; i++) {
            newArray[i] = fruits[i];
        }
        fruits = newArray;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size)
            throw new IllegalArgumentException();
    }

}
