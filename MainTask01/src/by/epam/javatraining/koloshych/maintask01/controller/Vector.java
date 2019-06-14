package by.epam.javatraining.koloshych.maintask01.controller;

import by.epam.javatraining.koloshych.maintask01.model.VectorUtil;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Random;

/**
 * This class is used by launching a calculation vector methods
 * and by launching View class
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @date 09/06/2019
 */

public class Vector {

    private static final Logger LOGGER = Logger.getLogger(Vector.class);
    private static Random random = new Random(2);

    public static void main(String[] args) {

        /**
         * This method creates a vector
         *
         * @param len - the length of the vector which you want to generate
         * @return double[]
         */
        int lengthOfVector = 8;
        double searchedNumber = 6.8;

        double[] vector = new double[lengthOfVector];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100);
            LOGGER.info("Created vector is: " + Arrays.toString(vector));

            double max = VectorUtil.countMax(vector);
            LOGGER.info("Maximum value of vector" + Arrays.toString(vector) + "is: " + max);

            double min = VectorUtil.countMin(vector);
            LOGGER.info("Minimum value of vector" + Arrays.toString(vector) + "is: " + min);

            double averageArithmetic = VectorUtil.countAverageArithmetic(vector);
            LOGGER.info("Arithmetic average of vector" + Arrays.toString(vector) + "is: " + averageArithmetic);

            double averageGeometric = VectorUtil.countAverageGeometric(vector);
            LOGGER.info("Geometric average of vector" + Arrays.toString(vector) + "is: " + averageGeometric);

            boolean isIncreasing = VectorUtil.isSortedIncreasing(vector);
            LOGGER.info("Vector is sorted: " + isIncreasing);

            boolean isDecreasing = VectorUtil.isSortedDecreasing(vector);
            LOGGER.info("Vector is sorted: " + isDecreasing);

            int localMin = VectorUtil.findLocalMin(vector);
            LOGGER.info("Index of Local minimum is: " + localMin);

            int localMax = VectorUtil.findLocalMax(vector);
            LOGGER.info("Index of Local maximum is: " + localMax);

            int linearIndex = VectorUtil.linearSearch(vector, searchedNumber);
            LOGGER.info("Index of searched number " + searchedNumber + " is: " + linearIndex);

            int binaryIndex = VectorUtil.binarySearch(vector, searchedNumber);
            LOGGER.info("Index of searched number " + searchedNumber + " is: " + binaryIndex);

            VectorUtil.reverserOrder(vector);

            VectorUtil.doBubbleSort(vector);

            VectorUtil.doInsertionSort(vector);

            VectorUtil.doSelectionSort(vector);

            VectorUtil.doMergeSort(vector);

            int start = 0, end = vector.length - 1;
            VectorUtil.doQuickSort(vector, start, end);

        }
    }
}


