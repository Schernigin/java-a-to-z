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
        return this.values.length > index;
    }

    public Object next() {
        return this.values[index++];
    }

    /**
     * In this method, the iterator reaches the first positive number in the array, and returns it.
     * @return The first positive number in the array.
     */

    public Object iteratEorvenNumbers() {
        for (int i = 0; i <this.values.length; i++) {
            if (this.values[i] % 2 == 0) {
                this.index = this.values[i];
                break;
            }

        }
        return this.index;
    }

    /**
     * This method checks whether the number is prime.
     * @return if prime number TRUE
     */

    public boolean checkPrimeNumber(int number) {
        boolean result = true;
            if (number <= 1) {
                result = false;
            } else {
                for (int i = 2; i < Math.sqrt(number); i++){
                    if (number % i == 0){
                        result = false;
                        break;
                    }
                }
            }
        return result;
    }

    public int iteratorPrime() {
        for (int i = 0; i < this.values.length; i++){
            if (checkPrimeNumber(this.values[i])) {
                this.index = this.values[i];
                break;
            }
        }
        return index;
    }
}
