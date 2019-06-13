package by.epam.javatraining.koloshych.maintask01.controller;

import by.epam.javatraining.koloshych.maintask01.model.VectorUtil;
import by.epam.javatraining.koloshych.maintask01.view.View;

/**
 * This class is used by launching a calculation vector methods
 * and by launching View class
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @date 09/06/2019
 */

public class Vector {
    public static void main(String[] args) {
        double[] vector = {2.8, 6.8, 3.6, 9.0};
        double number = 6.8;

        double max = VectorUtil.countMax(vector);
        View.print(max);

        double min = VectorUtil.countMin(vector);
        View.print(min);

        double averageArithmetic = VectorUtil.countAverageArithmetic(vector);
        View.print(averageArithmetic);

        double averageGeometric = VectorUtil.countAverageGeometric(vector);
        View.print(averageGeometric);

        boolean isIncreasing = VectorUtil.isSortedIncreasing(vector);
        View.printBoolean(isIncreasing);

        boolean isDecreasing = VectorUtil.isSortedDecreasing(vector);
        View.printBoolean(isDecreasing);

        int localMin = VectorUtil.findLocalMin(vector);
        View.print(localMin);

        int localMax = VectorUtil.findLocalMax(vector);
        View.print(localMax);

        int linearIndex = VectorUtil.linearSearch(vector, number);
        View.print(linearIndex);

        int binaryIndex = VectorUtil.binarySearch(vector, number);
        View.print(binaryIndex);

        VectorUtil.reverserOrder(vector);

        VectorUtil.doBubbleSort(vector);

        VectorUtil.doInsertionSort(vector);

        VectorUtil.doSelectionSort(vector);

        VectorUtil.doMergeSort(vector);

        int start = 0, end = vector.length - 1;
        VectorUtil.doQuickSort(vector, start, end);

    }
}


