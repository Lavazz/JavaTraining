package by.epam.javatraining.koloshych.lesson06.task03.controller;

import by.epam.javatraining.koloshych.lesson06.task03.model.FactorialOfNumberLogic;
import by.epam.javatraining.koloshych.lesson06.task03.view.View;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int n=-1;
        int nFactorial=FactorialOfNumberLogic.countFactorial(n);
        View.print(n, nFactorial);
    }
}
