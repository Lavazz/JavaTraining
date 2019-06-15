package by.epam.javatraining.koloshych.maintask01.additionaltask;

/**
 * This class is used to process a matrix
 * It solves the following tasks:
 * 1. Find extreme values
 * 2. Сheck whether the matrix is symmetric
 * 3. Find local min and max
 * 4. Transpose matrix
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @date 08/06/2019
 */

public class MatrixLogic {

    //1. Find extreme values
    public static double findMax(double[][] matrix) {
        double max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public static double findMin(double[][] matrix) {
        double min = matrix[0][0];
        for (double[] i : matrix) {
            for (double j : i) {
                if (min > j) {
                    min = j;
                }
            }
        }
        return min;
    }

    //2. Сheck whether the matrix is symmetric
    public static boolean isSymmetric(double matrix[][]) {
        //assume the matrix is square
        int rows = matrix.length, columns = matrix[0].length;
        boolean symmetric = true;
        for (int r = 0; r < rows && symmetric; r++) {
            //now declare two pointers one from left and one from right
            int left = 0, right = columns - 1;

            while (left < right) {
                if (matrix[r][left] != matrix[r][right]) {
                    symmetric = false;
                    break;
                }
                right--;
                left++;
            }
        }
        return symmetric;
    }

    //3. Find local min and max
    public static String isLocalMin(double[][] matrix) {
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 1; j++) {
                if ((matrix[i][j] < matrix[i + 1][j] && matrix[i][j] < matrix[i - 1][j])
                        && (matrix[i][j] < matrix[i][j + 1] && matrix[i][j] < matrix[i][j - 1])) {
                    return (i + ", " + j);
                }
            }
        }
        return "-1";
    }

    public static String isLocalMax(double[][] matrix) {
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 1; j++) {
                if ((matrix[i][j] > matrix[i + 1][j] && matrix[i][j] > matrix[i - 1][j])
                        && (matrix[i][j] > matrix[i][j + 1] && matrix[i][j] > matrix[i][j - 1])) {
                    return (i + ", " + j);
                }
            }
        }
        return "-1";
    }

    //4. Transpose matrix
    //without an additional matrix, only the square matrix can be transposed
    public static double[][] transposeMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                double temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

}
