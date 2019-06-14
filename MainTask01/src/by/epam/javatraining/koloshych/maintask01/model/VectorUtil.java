package by.epam.javatraining.koloshych.maintask01.model;

import org.apache.log4j.Logger;

import java.util.Arrays;

/**
 * This class is used to process a vector
 * It solves the following tasks:
 * 1. Find extreme values
 * 2. Find average values of vector
 * 3. Check if array is sorted
 * 4. Find first local extreme of array
 * 5. Search the element of array
 * 6. Revers elements of array
 * 7. Implements sorting algorithms
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @date 09/06/2019
 */

public class VectorUtil {

    private static final Logger LOGGER = Logger.getLogger(VectorUtil.class);


    /**
     * This method check if the vector is valid
     *
     * @param vector - the length of the vector which you want to generate
     * @return boolean
     */

    public static boolean checkVector(double[] vector) {
        boolean valid = true;
        if (vector == null || vector.length == 0) {
            LOGGER.warn("Vector is invalid!");
            valid = false;
        }
        return valid;
    }

    /**
     * Find maximum value of the vector
     * algorithm complexity O(n)
     *
     * @param vector- is double array in which the maximum value will be searched
     * @return double max value from array, or -1 if vector is error
     */
    public static double countMax(double[] vector) {
        if (!checkVector(vector)) {
            return -1;
        }
        //variable max assign the first element of the array
        double max = vector[0];
        for (int i = 0; i < vector.length; i++) {
            //if the i-element is greater than max, it becomes max
            if (vector[i] > max) {
                max = vector[i];
            }
        }
        return max;
    }

    /**
     * Find minimum value of the vector
     * algorithm complexity O(n)
     *
     * @param vector - is double array in which the minimum value will be searched
     * @return double min value from array, or -1 if vector is error
     */
    public static double countMin(double[] vector) {
        if (!checkVector(vector)) {
            return -1;
        }
        //variable min assign the first element of the array
        double min = vector[0];
        for (int i = 0; i < vector.length; i++) {
            //if the i-element is lower than min, it becomes min
            if (vector[i] < min) {
                min = vector[i];
            }
        }
        return min;
    }

    /**
     * Find average arithmetic of vector
     * algorithm complexity O(n)
     *
     * @param vector - is double array in which the average value will be searched
     * @return double averageArithmetic value from array, or -1 if vector is error
     */
    public static double countAverageArithmetic(double[] vector) {
        if (!checkVector(vector)) {
            return -1;
        }
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
     * @param vector - is double array in which the average value will be searched
     * @return double averageGeometric value from array, or -1 if vector is error
     */
    public static double countAverageGeometric(double[] vector) {
        if (!checkVector(vector)) {
            return -1;
        }
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
     * @param vector - is double array in which you want to check whether the sorted
     * @return boolean value - result of checking
     */
    public static boolean isSortedIncreasing(double[] vector) {
        boolean result = true;
        for (int i = 0; i < vector.length - 1; i++) {
            // check if the array grows
            if (vector[i] > vector[i + 1]) {
                result = false;
            }
        }
        return result;
    }

    /**
     * Check if array is sorted
     * algorithm complexity O(n)
     *
     * @param vector - is double in which you want to check whether the sorted decreasing
     * @return boolean value - result of checking
     */
    public static boolean isSortedDecreasing(double[] vector) {
        boolean result = true;
        for (int i = 0; i < vector.length - 1; i++) {
            //check if the array is decreasing
            if (vector[i] < vector[i + 1]) {
                result = false;
            }
        }
        return result;
    }

    /**
     * Find first local minimum of array
     * algorithm complexity O(n)  in the worst case
     *
     * @param vector - is double array in which search local min
     * @return int index of element wich is local minimum, or -1 min is not founded
     */
    public static int findLocalMin(double[] vector) {
        int result = -1;
//        if (vector == null || vector.length == 0) { ------------> в этом нету необходимости?
//            result= -1;
//       }
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
     * @param vector - is double array in which search local max
     * @return int index of element, wich is local maximum, or -1 min is not founded
     */
    public static int findLocalMax(double[] vector) {
        for (int i = 1; i < vector.length - 1; i++) {
            //check if element is more than left and right elements
            if (vector[i - 1] < vector[i] && vector[i + 1] < vector[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Search the element of array
     * algorithm complexity O(n) in the worst case for linearSearch
     *
     * @param vector - is double array in which search  double number
     * @return int index of number, or -1 min is not founded
     */
    public static int linearSearch(double[] vector, double number) {
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
     * @param vector - is double array in which search  double number
     * @return int index of number, or -1 min is not founded
     */
    public static int binarySearch(double[] vector, double number) {
        //sort the array
        doInsertionSort(vector);
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
            //direct the index in middle+1, remuving the first part from consideratoin
            else if (vector[middleIndex] < number) {
                firstIndex = middleIndex + 1;
            }
            // if the middle element is more
            // direct the index in middle-1, remuving the second part from consideratoin
            else if (vector[middleIndex] > number) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    /**
     * Revers elements of array
     * algorithm complexity O(n)
     *
     * @param vector - is double array in which reverse order of elements
     * @return void
     */
    public static void reverserOrder(double[] vector) throws NullPointerException {
        if (vector == null) {
            LOGGER.warn("Vector is invalid!");
        }
        for (int i = 0; i < vector.length / 2; i++) {
            //swapping elements
            double temp = vector[i];
            vector[i] = vector[vector.length - 1 - i];
            vector[vector.length - 1 - i] = temp;
        }
    }

    /**
     * Implements Bubble sorting algorithm
     * algorithm complexity O(n^2) in the worst case
     *
     * @param vector - is not sorted double array
     * @return void
     */
    public static void doBubbleSort(double[] vector) throws NullPointerException {
        if (vector == null) {
            LOGGER.warn("Vector is invalid!");
            // throw new NullPointerException("vector==null");   -------------??????????

        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    isSorted = false;
                    //swapping elements
                    double temp = vector[i + 1];
                    vector[i + 1] = vector[i];
                    vector[i] = temp;
                }
            }
        }
    }

    /**
     * Implements Insertion sorting algorithm
     * algorithm complexity O(n^2) in the worst case
     *
     * @param vector - is not sorted double array
     * @return void
     */
    public static void doInsertionSort(double[] vector) throws NullPointerException {
        if (vector == null) {
            LOGGER.warn("Vector is invalid!");
        }
        for (int i = 1; i < vector.length; i++) {
            double currElem = vector[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && vector[prevKey] > currElem) {
                vector[prevKey + 1] = vector[prevKey];
                vector[prevKey] = currElem;
                prevKey--;
            }
        }
    }

    /**
     * Implements Selection sorting algorithm
     * algorithm complexity O(n^2) in the worst case
     *
     * @param vector - is not sorted double array
     * @return double sorted vector
     */
    public static void doSelectionSort(double[] vector) throws NullPointerException {
        if (vector == null) {
            LOGGER.warn("Vector is invalid!");
        }
        //in turn we will consider all the subsets of the array elements
        // (0 - last, 1-last, 2-last,...)
        for (int i = 0; i < vector.length; i++) {
            //assume that first element is minimum
            double min = vector[i];
            int min_i = i;
            //in the remainder subset find element, that lesser than assume min
            for (int j = i + 1; j < vector.length; j++) {
                // if find , let's remind its index
                if (vector[j] < min) {
                    min = vector[j];
                    min_i = j;
                }
            }
            //if find element lesser than one in current position, swap its
            if (i != min_i) {
                double tmp = vector[i];
                vector[i] = vector[min_i];
                vector[min_i] = tmp;
            }
        }
    }

    /**
     * Implements Merge sorting algorithm
     * algorithm complexity O(n log n) in the worst case
     *
     * @param vector - is not sorted double array
     * @return void
     */

    public static void doMergeSort(double[] vector) throws NullPointerException {
        if (vector == null) {
            LOGGER.warn("Vector is invalid!");
        }
        //array for sorting
        double[] buffer1 = Arrays.copyOf(vector, vector.length);
        //buffer, with length= buffer1.length
        double[] buffer2 = new double[vector.length];
        //start index-first index in buffer1
        // end index-last index in buffer1
        double[] result = mergeSortInner(buffer1, buffer2, 0, vector.length);
    }

    public static double[] mergeSortInner(double[] buffer1, double[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // already sorted
        int middle = startIndex + (endIndex - startIndex) / 2;
        double[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        double[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        // merge
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        double[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    /**
     * Implements Insertion sorting algorithm
     * algorithm complexity O(n^2) in the worst case, but average value  is O(n log N),
     * in comparison with O(n^2) for Bubble , Insert, Selection sort
     *
     * @param vector - is not sorted double array , start of vector=0, end  is length of array
     * @return void
     */
    public static void doQuickSort(double[] vector, int start, int end) throws NullPointerException {
        if (vector == null) {
            LOGGER.warn("Vector is invalid!");
        }
        int partition = partition(vector, start, end);

        if (partition - 1 > start) {
            doQuickSort(vector, start, partition - 1);
        }
        if (partition + 1 < end) {
            doQuickSort(vector, partition + 1, end);
        }
    }

    public static int partition(double[] vector, int start, int end) {
        double pivot = vector[end];

        for (int i = start; i < end; i++) {
            if (vector[i] < pivot) {
                double temp = vector[start];
                vector[start] = vector[i];
                vector[i] = temp;
                start++;
            }
        }

        double temp = vector[start];
        vector[start] = pivot;
        vector[end] = temp;

        return start;
    }

    public static void quickSort(double[] vector, int low, int high) {
        if (vector == null || vector.length == 0) {
            // pick the pivot
            int middle = low + (high - low) / 2;
            double pivot = vector[middle];

            // make left < pivot and right > pivot
            int i = low, j = high;
            while (i <= j) {
                while (vector[i] < pivot) {
                    i++;
                }

                while (vector[j] > pivot) {
                    j--;
                }

                if (i <= j) {
                    double temp = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temp;
                    i++;
                    j--;
                }
            }

            // recursively sort two sub parts
            if (low < j) {
                quickSort(vector, low, j);
            }
            if (high > i) {
                quickSort(vector, i, high);
            }
        }
    }
}



