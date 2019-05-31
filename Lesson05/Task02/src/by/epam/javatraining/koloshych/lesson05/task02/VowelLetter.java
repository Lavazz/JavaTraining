package by.epam.javatraining.koloshych.lesson05.task02;

public class VowelLetter {
    public static void main(String[] args) {
        char letter = 'A';
        boolean result = VowelLetterLogic.isVowel(letter);
        View.print(result);
    }
}
