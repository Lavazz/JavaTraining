package by.epam.javatraining.koloshych.maintask01.controller;

import by.epam.javatraining.koloshych.maintask01.model.CreationOfVector;
import by.epam.javatraining.koloshych.maintask01.model.SearchOfVector;
import by.epam.javatraining.koloshych.maintask01.model.SortingOfVector;
import by.epam.javatraining.koloshych.maintask01.model.VectorCalculation;
import org.apache.log4j.Logger;

import java.util.Arrays;


/**
 * This class is used by launching a methods
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @date 14/06/2019
 */


public class VectorRunning {


    private static final Logger LOGGER = Logger.getLogger(VectorRunning.class);

    public static void main(String[] args) {

        /**
         * This method creates a vector
         *
         * @param len - the length of the vector which you want to generate
         * @return double[]
         */
        int lengthOfVector = 8;
        double searchedNumber = 6.8;


        LOGGER.info("Maximum value of vector" + "is: " + VectorCalculation.findMax(lengthOfVector));

        LOGGER.info("Minimum value of vector" + "is: " + VectorCalculation.findMin(lengthOfVector));

        LOGGER.info("Arithmetic average of vector" + "is: " + VectorCalculation.findAverageArithmetic(lengthOfVector));

        LOGGER.info("Geometric average of vector" + "is: " + VectorCalculation.findAverageGeometric(lengthOfVector));

        LOGGER.info("Vector is sorted: " + VectorCalculation.isSortedIncreasing(lengthOfVector));

        LOGGER.info("Vector is sorted: " + VectorCalculation.isSortedDecreasing(lengthOfVector));

        LOGGER.info("Index of Local minimum is: " + VectorCalculation.findLocalMin(lengthOfVector));

        LOGGER.info("Index of Local maximum is: " + VectorCalculation.findLocalMax(lengthOfVector));

        LOGGER.info("Index of searched number " + searchedNumber + " is: "
                + SearchOfVector.linearSearch(lengthOfVector, searchedNumber));

        LOGGER.info("Index of searched number " + searchedNumber + " is: "
                + SearchOfVector.binarySearch(CreationOfVector.createVector(lengthOfVector), searchedNumber));

        VectorCalculation.reverserOrder(lengthOfVector);

        SortingOfVector.doBubbleSort(lengthOfVector);

        SortingOfVector.doInsertionSort(lengthOfVector);

        SortingOfVector.doSelectionSort(lengthOfVector);

        SortingOfVector.doMergeSort(lengthOfVector);

        int start = 0, end = lengthOfVector - 1;
        SortingOfVector.doQuickSort(CreationOfVector.createVector(lengthOfVector), start, end);

    }
}