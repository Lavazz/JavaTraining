package by.epam.javatraining.koloshych.maintask01.model;

/**
 * This class is used to process a vector
 * It solves the following tasks:
 * 1. Find extreme values
 * 2. Find average values of vector
 * 3. Check if array is sorted
 * 4. Find first local extreme of array
 * 5. Revers elements of array
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @date 14/06/2019
 */


public class VectorCalculation {

    /**
     * Find maximum value of the vector
     * algorithm complexity O(n)
     *
     * @param lengthOfVector- is length of vector, wich will be created
     * @return int index of max value from array, or -1 if is not find ones
     */
    public static int findMax(int lengthOfVector) {
        double[] vector = CreationOfVector.createVector(lengthOfVector);
        //variable max assign the first element of the array
        double max = vector[0];
        int maxIndex = -1;
        for (int i = 0; i < vector.length; i++) {
            //if the i-element is greater than max, it becomes max
            if (vector[i] > max) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * Find minimum value of the vector
     * algorithm complexity O(n)
     *
     * @param lengthOfVector- is length of vector, wich will be created
     * @return int index of min value from array, or -1 if is not find ones
     */
    public static int findMin(int lengthOfVector) {
        double[] vector = CreationOfVector.createVector(lengthOfVector);
        //variable min assign the first element of the array
        double min = vector[0];
        int minIndex = -1;
        for (int i = 0; i < vector.length; i++) {
            //if the i-element is lower than min, it becomes min
            if (vector[i] < min) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * Find average arithmetic of vector
     * algorithm complexity O(n)
     *
     * @param lengthOfVector- is length of vector, wich will be created
     * @return double averageArithmetic value from array, or -1 if vector is error
     */
    public static double findAverageArithmetic(int lengthOfVector) {
        double[] vector = CreationOfVector.createVector(lengthOfVector);
        double sum = 0.0;
        //sum all elements of array
        for (double i : vector) {
            sum += i;
        }
        return sum / vector.length;
    }

    /**
     * Find average geometric of vector
     * algorithm complexity O(n)
     *
     * @param lengthOfVector- is length of vector, wich will be created
     * @return double averageGeometric value from array, or -1 if vector is error
     */
    public static double findAverageGeometric(int lengthOfVector) {
        double[] vector = CreationOfVector.createVector(lengthOfVector);
        double mul = 1;
        //multiply all elements of array
        for (double i : vector) {
            mul *= i;
        }
        return Math.pow(mul, 1.0 / vector.length);
    }

    /**
     * Check if array is sorted increasing
     * algorithm complexity O(n)
     *
     * @param lengthOfVector- is length of vector, wich will be created
     * @return boolean value - result of checking
     */
    public static boolean isSortedIncreasing(int lengthOfVector) {
        double[] vector = CreationOfVector.createVector(lengthOfVector);
        for (int i = 0; i < vector.length - 1; i++) {
            // check if the array grows
            if (vector[i] > vector[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if array is sorted
     * algorithm complexity O(n)
     *
     * @param lengthOfVector- is length of vector, wich will be created
     * @return boolean value - result of checking
     */
    public static boolean isSortedDecreasing(int lengthOfVector) {
        double[] vector = CreationOfVector.createVector(lengthOfVector);
        for (int i = 0; i < vector.length - 1; i++) {
            //check if the array is decreasing
            if (vector[i] < vector[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Find first local minimum of array
     * algorithm complexity O(n)  in the worst case
     *
     * @param lengthOfVector- is length of vector, wich will be created
     * @return int index of element wich is local minimum, or -1 min is not founded
     */
    public static int findLocalMin(int lengthOfVector) {
        double[] vector = CreationOfVector.createVector(lengthOfVector);
        int result = -1;
        for (int i = 1; i < vector.length - 1; i++) {
            //check if element is less than left and right elements
            if (vector[i - 1] > vector[i] && vector[i + 1] > vector[i]) {
                result = i;
            }
        }
        return result;
    }

    /**
     * Find first local maximum of array
     * algorithm complexity O(n)  in the worst case
     *
     * @param lengthOfVector- is length of vector, wich will be created
     * @return int index of element, wich is local maximum, or -1 min is not founded
     */
    public static int findLocalMax(int lengthOfVector) {
        double[] vector = CreationOfVector.createVector(lengthOfVector);
        for (int i = 1; i < vector.length - 1; i++) {
            //check if element is more than left and right elements
            if (vector[i - 1] < vector[i] && vector[i + 1] < vector[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Revers elements of array
     * algorithm complexity O(n)
     *
     * @param lengthOfVector- is length of vector, wich will be created
     * @return void
     */
    public static void reverserOrder(int lengthOfVector) {
        double[] vector = CreationOfVector.createVector(lengthOfVector);
        int centreOfVector =vector.length / 2;
        for (int i = 0; i < centreOfVector; i++) {
            //swapping elements
            double temp = vector[i];
            vector[i] = vector[vector.length - 1 - i];
            vector[vector.length - 1 - i] = temp;
        }
    }

}
