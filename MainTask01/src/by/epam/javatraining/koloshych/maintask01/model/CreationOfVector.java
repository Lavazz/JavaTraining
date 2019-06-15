package by.epam.javatraining.koloshych.maintask01.model;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Random;

public class CreationOfVector {

    private static final Logger LOGGER = Logger.getLogger(CreationOfVector.class);
    private static Random random = new Random(2);

    /**
     * This method creates a vector
     *
     * @param lengthOfVector - the length of the vector which you want to generate
     * @return double[]
     */
    public static double[] createVector(int lengthOfVector) {
        double[] vector = new double[lengthOfVector];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100);
        }
//        if (checkVector(vector)==false) {
//            throw InvalidVectorException;
//        }
        LOGGER.info("Created vector is: " + Arrays.toString(vector));
        return vector;
    }

    //Check if created vector is valid

    /**
     * This method check if the created vector is valid
     *
     * @param vector - the length of the vector which you want to generate
     * @return boolean
     */

    public static boolean checkVector(double[] vector) {
        boolean valid = true;
        if (vector == null || vector.length == 0) {
            LOGGER.error("Vector is invalid!");
            valid = false;
        }
        return valid;
    }
}