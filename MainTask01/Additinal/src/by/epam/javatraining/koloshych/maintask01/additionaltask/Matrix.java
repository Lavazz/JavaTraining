package by.epam.javatraining.koloshych.maintask01.additionaltask;

/**
 * This class is used by launching a calculation matrix methods
 * and by launching View class
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @date 08/06/2019
 */


public class Matrix {
    public static void main(String[] args) {
        double[][] matrixSquare = {{1, 2, 5},
                {4, 7, 6},
                {9, 3, 8}};

        double[][] matrix = {{1, 2, 2, 1},
                {4, 3, 3, 4},
                {2, 3, 3, 2}};

        double matrixMax = MatrixLogic.countMax(matrix);
        View.print(matrixMax);

        double matrixMin = MatrixLogic.countMin(matrix);
        View.print(matrixMin);

        boolean matrixSymetric = MatrixLogic.isSymmetric(matrix);
        View.print(matrixSymetric);

        String matrixLocalMin = MatrixLogic.isLocalMin(matrix);
        View.print(matrixLocalMin);

        double[][] transMatrix = MatrixLogic.transposeMatrix(matrix);
        View.print(transMatrix);
    }

}