package by.epam.javatraining.koloshych.maintask01.model;

/**
 * This class Searchs the element of array
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @date 14/06/2019
 */

public class SearchOfVector {

    /**
     * Search the element of array
     * algorithm complexity O(n) in the worst case for linearSearch
     *
     * @param lengthOfVector- is length of vector in which search  double number
     * @return int index of number, or -1 min is not founded
     */
    public static int linearSearch(int lengthOfVector, double number) {
        double[] vector = CreationOfVector.createVector(lengthOfVector);
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == number) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Search the element of array
     * algorithm complexity O(Log n) in the worst case for binarySearch
     *
     * @param vector- is length of vector in which search  double number
     * @return int index of number, or -1 min is not founded
     */
    public static int binarySearch(double[] vector, double number) {
        //sort the array
        int firstIndex = 0;
        int lastIndex = vector.length - 1;
        // condition of termination
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // if the middle element is target, return its index
            if (vector[middleIndex] == number) {
                return middleIndex;
            }
            // if the middle element is less
            //direct the index in middle+1, remuving the first part from consideration
            else if (vector[middleIndex] < number) {
                firstIndex = middleIndex + 1;
            }
            // if the middle element is more
            // direct the index in middle-1, remuving the second part from consideration
            else if (vector[middleIndex] > number) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
