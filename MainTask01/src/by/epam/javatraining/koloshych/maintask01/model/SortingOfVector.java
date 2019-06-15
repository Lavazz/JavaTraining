package by.epam.javatraining.koloshych.maintask01.model;

import org.apache.log4j.Logger;

import java.util.Arrays;

/**
 * This class implements sorting algorithms
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @date 14/06/2019
 */

public class SortingOfVector {
    private static final Logger LOGGER = Logger.getLogger(SortingOfVector.class);

    /**
     * Implements Bubble sorting algorithm
     * algorithm complexity O(n^2) in the worst case
     *
     * @param lengthOfVector- is length of vector, wich will be created
     * @return void
     */
    public static void doBubbleSort(int lengthOfVector) {
        double[] vector = CreationOfVector.createVector(lengthOfVector);
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < vector.length - 1 - i; i++) {
                if (vector[i] > vector[i + 1]) {
                    isSorted = false;
                    //swapping elements
                    double temp = vector[i + 1];
                    vector[i + 1] = vector[i];
                    vector[i] = temp;
                }
            }
        }
        LOGGER.info("Sorted vector is: " + Arrays.toString(vector));
    }

    /**
     * Implements Insertion sorting algorithm
     * algorithm complexity O(n^2) in the worst case
     *
     * @param lengthOfVector- is length of vector, wich will be created
     * @return void
     */
    public static void doInsertionSort(int lengthOfVector) {
        double[] vector = CreationOfVector.createVector(lengthOfVector);
        for (int i = 1; i < vector.length; i++) {
            double currElem = vector[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && vector[prevKey] > currElem) {
                vector[prevKey + 1] = vector[prevKey];
                vector[prevKey] = currElem;
                prevKey--;
            }
        }
        LOGGER.info("Sorted vector is: " + Arrays.toString(vector));
    }

    /**
     * Implements Selection sorting algorithm
     * algorithm complexity O(n^2) in the worst case
     *
     * @param lengthOfVector- is length of vector, wich will be created
     * @return double sorted vector
     */
    public static void doSelectionSort(int lengthOfVector) {
        double[] vector = CreationOfVector.createVector(lengthOfVector);
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
        LOGGER.info("Sorted vector is: "+Arrays.toString(vector));
    }

    /**
     * Implements Merge sorting algorithm
     * algorithm complexity O(n log n) in the worst case
     *
     * @param lengthOfVector- is length of vector, wich will be created
     * @return void
     */

    public static void doMergeSort(int lengthOfVector) {
        double[] vector = CreationOfVector.createVector(lengthOfVector);
        //array for sorting
        double[] buffer1 = Arrays.copyOf(vector, vector.length);
        //buffer, with length= buffer1.length
        double[] buffer2 = new double[vector.length];
        //start index-first index in buffer1
        // end index-last index in buffer1
        double[] result = mergeSortInner(buffer1, buffer2, 0, vector.length);
        LOGGER.info("Sorted vector is: "+Arrays.toString(vector));
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
    public static void doQuickSort(double[] vector, int start, int end) {
        int partition = partition(vector, start, end);
        if (partition - 1 > start) {
            doQuickSort(vector, start, partition - 1);
        }
        if (partition + 1 < end) {
            doQuickSort(vector, partition + 1, end);
        }
        LOGGER.info("Sorted vector is: "+Arrays.toString(vector));
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
