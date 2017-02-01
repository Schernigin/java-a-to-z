package ru.schernigin.services;

import java.util.Iterator;

/**
 * Class Iterator Array
 * Author schernigin
 * Sence 26.01.2017
 * Version 1.0
 */
public class IteratorArray implements Iterator {

    /**
     * internal field.
     */

    private final int[] values;

    /**
     * internal field.
     */

    int index = 0;

    /**
     * Construktor.
     * @param values
     */

    public IteratorArray(final int[] values) {
        this.values = values;
    }

    /**
     * This method checks whether there are more values in the array.
     * @return boolean
     */

    public boolean hasNext() {
        return this.values.length > index;
    }

    /**
     * This method returns item, the carriage is moved forward.
     * @return int
     */

    public Object next() {
        return this.values[index++];
    }

    /**
     * This method removes position and moves to the previous.
     */

    @Override
    public void remove() {
        this.values[index--] = 0;
    }


    /**
     * This method checks whether the number is prime.
     * @return if prime number TRUE
     */




}
