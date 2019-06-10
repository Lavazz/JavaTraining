package by.epam.javatraining.koloshych.maintask01.additionaltask;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixLogicTest {

    @Test
    public void countMax() {
        double[][] matrix = {{1, 2, 3, 5},
                {4, 3, 6, 4},
                {2, 3, 8, 9}};
        double expected = 9;
        double delta = 0.2;
        Assert.assertEquals(expected, MatrixLogic.countMax(matrix), delta);
    }

    @Test
    public void countMin() {
        double[][] matrix = {{1, 2, 3, 5},
                {4, 3, 6, 4},
                {2, 3, 8, 9}};
        double expected = 1;
        double delta = 0.2;
        Assert.assertEquals(expected, MatrixLogic.countMin(matrix), delta);
    }

    @Test
    public void isSymmetricFalse() {
        double[][] matrix = {{1, 2, 3, 5},
                {4, 3, 6, 4},
                {2, 3, 8, 9}};
        boolean expected = false;
        Assert.assertEquals(expected, MatrixLogic.isSymmetric(matrix));
    }

    @Test
    public void isSymmetricTrue() {
        double[][] matrix = {{1, 2, 2, 1},
                {4, 3, 3, 4},
                {2, 3, 3, 2}};
        boolean expected = true;
        Assert.assertEquals(expected, MatrixLogic.isSymmetric(matrix));
    }

    @Test
    public void isLocalMin() {
        double[][] matrix = {{4, 6, 3, 5},
                {4, 3, 6, 4},
                {6, 5, 8, 9}};
        String expected = "1, 1";
        Assert.assertEquals(expected, MatrixLogic.isLocalMin(matrix));
    }

    @Test
    public void isLocalMax() {
        double[][] matrix = {{4, 6, 3, 5},
                {4, 3, 6, 4},
                {6, 5, 2, 9}};
        String expected = "1, 2";
        Assert.assertEquals(expected, MatrixLogic.isLocalMax(matrix));
    }

    @Test
    public void transposeMatrix() {
        double[][] matrix = {{1, 2, 5},
                {4, 7, 6},
                {9, 3, 8}};
        double[][] expected = {{1, 4, 9},
                {2, 7, 3},
                {5, 6, 8}};
        Assert.assertArrayEquals(expected, MatrixLogic.transposeMatrix(matrix));
    }
}