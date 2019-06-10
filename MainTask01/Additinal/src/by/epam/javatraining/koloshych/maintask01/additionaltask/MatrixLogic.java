package by.epam.javatraining.koloshych.maintask01.additionaltask;

/**
 * This class is used to process a vector
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
    public static double countMax(double[][] mat) {
        double max = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (max < mat[i][j]) {
                    max = mat[i][j];
                }
            }
        }
        return max;
    }

    public static double countMin(double[][] mat) {
        double min = mat[0][0];
        for (double[] i : mat) {
            for (double j : i) {
                if (min > j) {
                    min = j;
                }
            }
        }
        return min;
    }

    //2. Сheck whether the matrix is symmetric
    public static boolean isSymmetric(double mat[][]) {
        //assume the matrix is square
        int rows = mat.length, columns = mat[0].length;

        boolean symmetric = true;
        for (int r = 0; r < rows && symmetric; r++) {
            //now declare two pointers one from left and one from right
            int left = 0, right = columns - 1;

            while (left < right) {
                if (mat[r][left] != mat[r][right]) {
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
    public static String isLocalMin(double[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[1].length - 1; j++) {
                if ((mat[i][j] < mat[i + 1][j] && mat[i][j] < mat[i - 1][j])
                        && (mat[i][j] < mat[i][j + 1] && mat[i][j] < mat[i][j - 1])) {
                    return (i + ", " + j);
                }
            }
        }
        return "-1";
    }

    public static String isLocalMax(double[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[1].length - 1; j++) {
                if ((mat[i][j] > mat[i + 1][j] && mat[i][j] > mat[i - 1][j])
                        && (mat[i][j] > mat[i][j + 1] && mat[i][j] > mat[i][j - 1])) {
                    return (i + ", " + j);
                }
            }
        }
        return "-1";
    }

    //4. Transpose matrix
    public static double[][] transposeMatrix(double[][] matrix) {
//without an additional matrix, only the square matrix can be transposed
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
