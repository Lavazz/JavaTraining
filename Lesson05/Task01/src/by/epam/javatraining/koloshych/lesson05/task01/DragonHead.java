package by.epam.javatraining.koloshych.lesson05.task01;

public class DragonHead {
    public static void main(String[] args) {
        int age = 100;
        int head = DragonHeadLogic.calcHeads(age);
        int eye = DragonHeadLogic.calcEye(head);
        View.print(age, head, eye);
    }
}


