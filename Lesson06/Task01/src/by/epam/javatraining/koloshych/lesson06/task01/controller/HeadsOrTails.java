package by.epam.javatraining.koloshych.lesson06.task01.controller;

import by.epam.javatraining.koloshych.lesson06.task01.model.HeadsOrTailsLogic;
import by.epam.javatraining.koloshych.lesson06.task01.view.View;

public class HeadsOrTails {
    public static void main(String[] args) {
        int count = 10;
        int countHeads = HeadsOrTailsLogic.happenHeads(count);
        View.print(countHeads, count);
    }
}
