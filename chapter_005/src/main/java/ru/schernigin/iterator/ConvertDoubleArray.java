package ru.schernigin.iterator;



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
        return this.values.length > this.horizontal || this.values[0].length > this.vertical;
    }

    public int next() {
        int result = 0;
        if (hasNext()) {
            result = this.values[this.vertical][this.horizontal];
            this.horizontal++;
        } else {
            result = this.values[this.vertical][this.horizontal];
            this.vertical++;
        }
        return result;
    }
}
