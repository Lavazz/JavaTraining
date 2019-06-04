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

    public static boolean isVowelTwo(char letter) {
        char letterLover = Character.toLowerCase(letter);
        return "aeiouy".contains(Character.toString(letterLover));
    }

    public static boolean isVowelThree(char letter) {
        char letterLover = Character.toLowerCase(letter);
        char [] vowel = {'a', 'e', 'i', 'o', 'u', 'y'};
        for(char v: vowel){
            if(v==letterLover){
                return true;
            }
        }
        return false;
    }
}
