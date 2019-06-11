package by.epam.javatraining.koloshych.maintask01;

import java.util.Arrays;
import java.util.Random;

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
    //1. Find extreme values
    // algorithm complexity O(n)

    //this way you can specify an array, but then in the test I will not know expected
//        Random random=new Random();
//        double [] vector=new double[8];
//        for (int i = 0; i <vector.length ; i++) {
//            vector[i]=random.nextDouble();
//        }


    public static double countMax(double[] vector) {
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

    public static double countMin(double[] vector) {
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

    //2. Find average values of vector
    // algorithm complexity O(n)
    public static double countAverageArithmetic(double[] vector) {
        double sum = 0.0;
        //sum all elements of array
        for (double i : vector) {
            sum += i;
        }
        return sum / vector.length;
    }

    public static double countAverageGeometric(double[] vector) {
        double mul = 1;
        //multiply all elements of array
        for (double i : vector) {
            mul *= i;
        }
        return Math.pow(mul, 1.0 / vector.length);
    }

    //3. Check if array is sorted
    // algorithm complexity O(n)
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

    //4. Find first local extreme of array
    // algorithm complexity O(n)  in the worst case
    public static int findLocalMin(double[] vector) {
        for (int i = 1; i < vector.length - 1; i++) {
            //check if element is less than left and right elements
            if (vector[i - 1] > vector[i] && vector[i + 1] > vector[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int findLocalMax(double[] vector) {
        for (int i = 1; i < vector.length - 1; i++) {
            //check if element is more than left and right elements
            if (vector[i - 1] < vector[i] && vector[i + 1] < vector[i]) {
                return i;
            }
        }
        return -1;
    }

    //5. Search the element of array
    // algorithm complexity O(n) in the worst case for linearSearch
    public static int linearSearch(double[] vector, double number) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == number) {
                return i;
            }
        }
        return -1;
    }

    // algorithm complexity O(Log n) in the worst case for binarySearch
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

    //6. Revers elements of array
    // algorithm complexity O(n)
    public static double[] reverserOrder(double[] vector) {
        for (int i = 0; i < vector.length / 2; i++) {
            //swapping elements
            double temp = vector[i];
            vector[i] = vector[vector.length - 1 - i];
            vector[vector.length - 1 - i] = temp;
        }
        return vector;
    }

    //7. Implements sorting algorithms
    // algorithm complexity O(n^2) in the worst case
    public static double[] doBubbleSort(double[] vector) {
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
        return vector;
    }
    // algorithm complexity O(n^2) in the worst case
    public static double[] doInsertionSort(double[] vector) {
        for (int i = 1; i < vector.length; i++) {
            double currElem = vector[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && vector[prevKey] > currElem) {
                vector[prevKey + 1] = vector[prevKey];
                vector[prevKey] = currElem;
                prevKey--;
            }
        }
        return vector;
    }

    // algorithm complexity O(n^2) in the worst case
    public static double[] doSelectionSort(double[] vector) {
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
        return vector;
    }

    // algorithm complexity O(n log n) in the worst case
    public static double[] doMergeSort(double[] vector) {
        //array for sorting
        double[] buffer1 = Arrays.copyOf(vector, vector.length);
        //buffer, with length= buffer1.length
        double[] buffer2 = new double[vector.length];
        //start index-first index in buffer1
        // end index-last index in buffer1
        double[] result = mergeSortInner(buffer1, buffer2, 0, vector.length);
        return result;
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

    // algorithm complexity O(n^2) in the worst case, but average value  is O(n log N),
    //in comparison with O(n^2) for Bubble , Insert, Selection sort
    public static double[] doQuickSort(double[] vector, int start, int end) {
        int partition = partition(vector, start, end);

        if (partition - 1 > start) {
            doQuickSort(vector, start, partition - 1);
        }
        if (partition + 1 < end) {
            doQuickSort(vector, partition + 1, end);
        }
        return vector;
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

    public static double[] quickSort(double[] vector, int low, int high) {
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
        return vector;
    }
}



