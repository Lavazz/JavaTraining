package by.epam.javatraining.koloshych.lesson05.task02;

public class VowelLetter {
    public static void main(String[] args) {
        char letter = 'A';
        boolean result = VowelLetterLogic.isVowel(letter);
        boolean result2 = VowelLetterLogic.isVowelTwo(letter);
        boolean result3 = VowelLetterLogic.isVowelThree(letter);
        View.print(result);
        View.print(result2);
        View.print(result3);
    }
}
