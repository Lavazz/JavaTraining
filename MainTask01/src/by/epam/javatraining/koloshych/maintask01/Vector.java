package by.epam.javatraining.koloshych.maintask01;

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

        double[] reverserOrder = VectorUtil.reverserOrder(vector);
        View.printArray(reverserOrder);

        double[] sortedBooble = VectorUtil.doBubbleSort(vector);
        View.printArray(sortedBooble);

        double[] sortedIncertion = VectorUtil.doInsertionSort(vector);
        View.printArray(sortedIncertion);

        double[] sortedSelection = VectorUtil.doSelectionSort(vector);
        View.printArray(sortedSelection);

        double[] sortedMerge = VectorUtil.doMergeSort(vector);
        View.printArray(sortedMerge);

        int start = 0, end = vector.length-1;
        double[] sortedQuick = VectorUtil.doQuickSort(vector, start, end);
        View.printArray(sortedQuick);
    }
}
