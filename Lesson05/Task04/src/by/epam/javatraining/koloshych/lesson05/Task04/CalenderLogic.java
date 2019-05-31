package by.epam.javatraining.koloshych.lesson05.Task04;

public class CalenderLogic {
    private static final int LAST_MONTH = 12;

    public static int giveNewDay(int day, int month, int year) {
        int lastDay = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDay = 31; break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastDay = 31; break;
            case 2:
                switch (year % 4) {
                    case 1:
                    case 2:
                    case 3:
                        lastDay = 28; break;
                    case 0:
                        if (year % 400 == 0) {
                            lastDay = 29; break;
                        } else if (year % 100 == 0) {
                            lastDay = 28; break;
                        } else {
                            lastDay = 29; break;
                        }
                } break;
        }

        if (day >= 1 && day <= lastDay) {
            if (day == lastDay) {
                day = 1;
            } else {
                day++;
            }
        }else {
            day=0;
        }
        return day;
    }

    public static int giveNewMonth(int newDay, int month) {
        if (month >= 1 && month <= LAST_MONTH) {
            if (newDay == 1) {
                month++;
            }

            if (month == 13) {
                month = 1;
            }
        }else{
            month=0;
        }
        return month;
    }

    public static int giveNewYear(int newMonth, int year) {
        if (newMonth == 1) {
            year++;
        }
        return year;
    }
}