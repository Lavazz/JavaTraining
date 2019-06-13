package by.epam.javatraining.koloshych.lesson06.additional.task04;

public class Polindrom {

    public static void main(String[] args) {
        int number = 123321;
        boolean polindrom = PolindromLogic.isPolindrom(number);
        View.print(polindrom);
    }
}
