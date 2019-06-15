package by.epam.javatraining.koloshych.maintask01.additionaltask;

import org.apache.log4j.Logger;

import java.util.Arrays;

/**
 * This class is used by launching a calculation matrix methods
 * and by launching View class
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @date 08/06/2019
 */


public class Matrix {

    private static final Logger LOGGER = Logger.getLogger(Matrix.class);

    public static void main(String[] args) {

        double[][] matrix = {{1, 2, 2, 1},
                {4, 3, 3, 4},
                {2, 3, 3, 2}};

        LOGGER.info("Maximum value of matrix is: " + MatrixLogic.findMax(matrix));

        LOGGER.info("Minimum value of matrix is: " + MatrixLogic.findMin(matrix));

        LOGGER.info("Matrix is simetric:  " + MatrixLogic.isSymmetric(matrix));

        LOGGER.info("Local maximum of matrix  is: " + MatrixLogic.isLocalMax(matrix));

        LOGGER.info("Local minimum of matrix  is: " + MatrixLogic.isLocalMin(matrix));

        LOGGER.info("Transpouse of matrix  is: " + Arrays.deepToString(MatrixLogic.transposeMatrix(matrix)));
    }
}