package by.epam.javatraining.koloshych.lesson05.Task04;

public class Calendar {
    public static void main(String[] args) {
        int day=31;
        int month=3;
        int year=1546;
        int newDay= CalenderLogic.giveNewDay(day, month, year);
        int newMonth= CalenderLogic.giveNewMonth(newDay, month);
        int newYear=CalenderLogic.giveNewYear(newMonth, year);
        View.print(newDay, newMonth, newYear);
    }
}
