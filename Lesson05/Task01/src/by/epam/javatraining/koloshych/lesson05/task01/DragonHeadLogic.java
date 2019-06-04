package by.epam.javatraining.koloshych.lesson05.task01;

public class DragonHeadLogic {

    public static final int YOUNG_AGE = 200;
    public static final int OLD_AGE = 300;
    public static final int YOUNG_GROWTH = 3;
    public static final int YOUNG_OLD_GROWTH = 2;
    public static final int OLD_GROWTH = 1;
    public static final int AMOUNT_EYES = 2;

    public static int calcHeads(int age) {
        int head = 3;
        if (age < 0) {
            return 0;
        }
        if (age < YOUNG_AGE) {
            head += YOUNG_GROWTH * age;
        } else if (age < OLD_AGE) {
            head += YOUNG_AGE * YOUNG_GROWTH - YOUNG_AGE * YOUNG_OLD_GROWTH + YOUNG_OLD_GROWTH * age;
        } else {
            head += YOUNG_AGE * YOUNG_GROWTH + (OLD_AGE - YOUNG_AGE) * YOUNG_OLD_GROWTH - OLD_AGE * OLD_GROWTH + OLD_GROWTH * age;
        }
        return head;
    }

    public static int calcEye(int age) {
        return calcHeads(age) * AMOUNT_EYES;
    }
}