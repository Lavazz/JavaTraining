package by.epam.javatraining.koloshych.lesson05.task02;

public class VowelLetterLogic {

    public static boolean isVowel(char letter) {
        char letterLover = Character.toLowerCase(letter);
        //letter a, e, i, o, u, y, A, E, I, O, U, Y
        boolean result = false;
        switch (letterLover) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                result = true;
        }
        return result;
    }
}
