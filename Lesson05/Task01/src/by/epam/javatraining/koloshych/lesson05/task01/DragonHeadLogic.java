package by.epam.javatraining.koloshych.lesson05.task01;

public class DragonHeadLogic {

    private static final int YOUNG_AGE = 200;
    private static final int OLD_AGE = 300;
    private static final int YOUNG_GROWTH = 3;
    private static final int YOUNG_OLD_GROWTH = 2;
    private static final int OLD_GROWTH = 1;

    public static int calcHeads(int age) {
        int head = 3; //was born with 3 heads
        if (age >= 0) {
            if (age < YOUNG_AGE) {
                head += age * YOUNG_GROWTH;
            } else if (age < OLD_AGE) {
                head += YOUNG_AGE * YOUNG_GROWTH + (age - YOUNG_AGE) * YOUNG_OLD_GROWTH;
            } else {
                head += YOUNG_AGE * YOUNG_GROWTH + (OLD_AGE - YOUNG_AGE) * YOUNG_OLD_GROWTH + (age - OLD_AGE) * OLD_GROWTH;
            }
        } else head = 0;
        return head;
    }

    public static int calcEye(int head) {
        //on one head 2 eyes
        return head * 2;
    }
}