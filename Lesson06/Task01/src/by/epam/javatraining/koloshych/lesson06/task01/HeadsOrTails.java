package by.epam.javatraining.koloshych.lesson06.task01;

public class HeadsOrTails {
    public static void main(String[] args) {
        int count = 10;
        int countHeads = HeadsOrTailsLogic.happenHeads(count);
        View.print(countHeads, count);
    }
}
