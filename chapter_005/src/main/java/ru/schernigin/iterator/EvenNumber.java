package ru.schernigin.iterator;

import java.util.Iterator;

/**
 * Class EvenNumber
 * Author schernigin
 * Sence 01.02.2017
 * Version 1.0
 */
public class EvenNumber implements Iterator<Integer> {

    /**
     *internal field.
     */
    private final int[] values;

    /**
     *internal field.
     */
    private int index = 0;

    /**
     * Construktor.
     * @param values
     */
    public EvenNumber(final int[] values) {
        this.values = values;
    }


    /**
     * This method checks whether there are still an array of positive numbers.
     * @return return true if there is.
     */
    @Override
    public boolean hasNext() {
        boolean result = false;
        for (int i = this.index; i < this.values.length; i++) {
            if (this.values[i] % 2 == 0) {
                result = true;
            }
        }
        return result;
    }


    /**
     * This method returns a positive number.
     * @return pozitive number.
     */
    @Override
    public Integer next() {
        int tmp = 0;
        for (int i = this.index; i < this.values.length; i++) {
            if (this.values[i] % 2 == 0) {
                tmp = this.values[i];
                this.index = this.values[i++];
                break;
            }
        }
        return tmp;
    }

    /**
     * This method removes position and moves to the previous.
     */
    @Override
    public void remove() {
        this.values[index--] = 0;
    }
}
