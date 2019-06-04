package by.epam.javatraining.koloshych.lesson05.Task04;

public class CalenderLogic {
    public static final int LAST_MONTH = 12;
    public static final int APRIL_DAY = 30;
    public static final int FEBRUARY_LEAP_DAY = 29;
    public static final int FEBRUARY_USUAL_DAY = 28;
    public static final int FIRSTL_DAY = 1;
    public static final int FIRSTL_MONTH = 1;

    public static int giveNewDay(int day, int month, int year) {
        int lastDay=31;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                lastDay = APRIL_DAY;
                break;
            case 2:
                switch (year % 4) {
                    case 1:
                    case 2:
                    case 3:
                        lastDay = FEBRUARY_USUAL_DAY; break;
                    case 0:
                        if (year % 400 == 0) {
                            lastDay = FEBRUARY_LEAP_DAY; break;
                        } else if (year % 100 == 0) {
                            lastDay = FEBRUARY_USUAL_DAY; break;
                        } else {
                            lastDay = FEBRUARY_LEAP_DAY;  break;
                        }
                }
                break;
        }

        if (day >= FIRSTL_DAY && day <= lastDay) {
            if (day == lastDay) {
                day = FIRSTL_DAY;
            } else {
                day++;
            }
        } else {
            day = 0;
        }
        return day;
    }

    public static int giveNewMonth(int newDay, int month) {
        if (month >= 1 && month <= LAST_MONTH) {
            if (newDay == FIRSTL_DAY) {
                month++;
            }

            if (month == 13) {
                month = FIRSTL_MONTH;
            }
        } else {
            month = 0;
        }
        return month;
    }

    public static int giveNewYear(int newMonth, int year) {
        if (newMonth == FIRSTL_MONTH) {
            year++;
        }
        return year;
    }
}