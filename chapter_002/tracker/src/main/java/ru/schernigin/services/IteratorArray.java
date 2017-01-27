package ru.schernigin.services;

import java.util.Iterator;

/**
 * Class Iterator Array
 * Author schernigin
 * Sence 26.01.2017
 * Version 1.0
 */
public class IteratorArray implements Iterator {

    private final int[] values;
    int index = 0;

    public IteratorArray(final int[] values) {
        this.values = values;
    }

    public boolean hasNext() {
        return values.length > index;
    }

    public Object next() {
        return values[index++];
    }

    /**
     * In this method, the iterator reaches the first positive number in the array, and returns it.
     * @return The first positive number in the array.
     */

    public Object iteratEorvenNumbers() {
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                index = values[i];
                break;
            }
        }
        return index;
    }

    /**
     * In this method the iterator reaches the first prime number in the array and returns it
     * @return first prime number in the array
     */

    public Object iteratorPrimes() {
        return null;
    }
}
