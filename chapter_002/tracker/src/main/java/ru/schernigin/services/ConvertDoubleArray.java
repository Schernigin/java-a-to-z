package ru.schernigin.services;



/**
 * CLass ConvertDoubleArray.
 * @author schernigin
 * @since 04.02.2017
 * @version 1.0
 */
public class ConvertDoubleArray {

    private int[][] values;

    int horizontal = 0;

    int vertical = 0;

    public ConvertDoubleArray(int[][] values) {
        this.values = values;
    }


    public boolean hasNext() {
        return values.length > horizontal || values[0].length > vertical;
    }

    public int next() {
        int result;
        if (hasNext()) {
            result = values[vertical][horizontal + 1];
        } else {
            result = values[vertical + 1][horizontal];
        }
        return result;
    }

}
