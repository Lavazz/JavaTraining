package by.epam.javatraining.koloshych.maintask01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorUtilTest {

    @Test
    public void countMax() {
        double[] vector = {2.8, 6.8, 3.6, 9.0};
        double expected = 9.0;
        double delta = 0.1;
        Assert.assertEquals(expected, VectorUtil.countMax(vector), 0.1);
    }

    @Test
    public void countMin() {
        double[] vector = {2.8, 6.8, 3.6, 9.0};
        double expected = 2.8;
        double delta = 0.1;
        Assert.assertEquals(expected, VectorUtil.countMin(vector), 0.1);
    }

    @Test
    public void countAverageArithmetic() {
        double[] vector = {2.8, 6.8, 3.6, 9.0};
        double expected = 5.55;
        double delta = 0.1;
        Assert.assertEquals(expected, VectorUtil.countAverageArithmetic(vector), 0.1);
    }

    @Test
    public void countAverageGeometric() {
        double[] vector = {2.8, 6.8, 3.6, 9.0};
        double expected = 4.98;
        double delta = 0.1;
        Assert.assertEquals(expected, VectorUtil.countAverageGeometric(vector), 0.5);
    }

    @Test
    public void isSortedFalse() {
        double[] vector = {2.8, 6.8, 3.6, 9.0};
        boolean expected = false;
        Assert.assertEquals(expected, VectorUtil.isSortedIncreasing(vector));
    }

    @Test
    public void isSortedTrue() {
        double[] vector = {2.8, 3.6, 6.8, 9.0};
        boolean expected = true;
        Assert.assertEquals(expected, VectorUtil.isSortedIncreasing(vector));
    }

    @Test
    public void findLocalMin() {
        double[] vector = {2.8, 6.8, 3.6, 9.0};
        int expected = 2;
        Assert.assertEquals(expected, VectorUtil.findLocalMin(vector));
    }

    @Test
    public void findLocalMax() {
        double[] vector = {2.8, 6.8, 3.6, 9.0};
        int expected = 1;
        Assert.assertEquals(expected, VectorUtil.findLocalMax(vector));
    }

    @Test
    public void linearSearch() {
        double[] vector = {2.8, 6.8, 3.6, 9.0};
        int number = 1;
        int expected = 1;
        Assert.assertEquals(expected, VectorUtil.linearSearch(vector, number));
    }

    @Test
    public void binarySearch() {
        double[] vector = {2.8, 6.8, 3.6, 9.0};
        double number = 6.8;
        int expected = 1;
        Assert.assertEquals(expected, VectorUtil.linearSearch(vector, number));
    }

    @Test
    public void reverserOrder() {
        double[] vector = {2.8, 3.6, 6.8, 9.0, 10.1};
        double[] expected = {10.1, 9.0, 6.8, 3.6, 2.8};
        double delta = 0.1;
        Assert.assertArrayEquals(expected, VectorUtil.reverserOrder(vector), delta);
    }

    @Test
    public void doBubbleSort() {
        double[] vector = {2.8, 6.8, 9.0, 3.6, 10.1};
        double[] expected = {2.8, 3.6, 6.8, 9.0, 10.1};
        double delta = 0.1;
        Assert.assertArrayEquals(expected, VectorUtil.doBubbleSort(vector), delta);
    }

    @Test
    public void doInsertionSort() {
        double[] vector = {2.8, 6.8, 9.0, 3.6, 10.1};
        double[] expected = {2.8, 3.6, 6.8, 9.0, 10.1};
        double delta = 0.1;
        Assert.assertArrayEquals(expected, VectorUtil.doInsertionSort(vector), delta);
    }

    @Test
    public void doSelectionSort() {
        double[] vector = {2.8, 6.8, 9.0, 3.6, 10.1};
        double[] expected = {2.8, 3.6, 6.8, 9.0, 10.1};
        double delta = 0.1;
        Assert.assertArrayEquals(expected, VectorUtil.doSelectionSort(vector), delta);
    }

    @Test
    public void doMergeSort() {
        double[] vector = {2.8, 6.8, 9.0, 3.6, 10.1};
        double[] expected = {2.8, 3.6, 6.8, 9.0, 10.1};
        double delta = 0.1;
        Assert.assertArrayEquals(expected, VectorUtil.doMergeSort(vector), delta);
    }

    @Test
    public void doQuickSort() {
        double[] vector = {2.8, 6.8, 9.0, 3.6, 10.1};
        int start = 0;
        int end = vector.length - 1;
        double[] expected = {2.8, 3.6, 6.8, 9.0, 10.1};
        double delta = 0.1;
        Assert.assertArrayEquals(expected, VectorUtil.doQuickSort(vector, start, end), delta);
    }
}