package ru.schernigin.iterator;

import java.util.Iterator;

/**
 * Class PrimeNumber
 * Author schernigin
 * Sence 01.02.2017
 * Version 1.0
 */
public class PrimeNumber implements Iterator<Integer> {

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
    public PrimeNumber(final int[] values) {
        this.values = values;
    }


    /**
     * This method checks whether there are still an array of prime numbers.
     * @return true if there is.
     */
    @Override
    public boolean hasNext() {
        boolean result = true;
        for (int i = index; i < this.values.length; i++) {
            if (checkPrimeNumber(values[i]));
            result = false;
        }
        return result;
    }


    /**
     * This method returns a prime number.
     * @return prime number.
     */
    @Override
    public Integer next() {
        int tmp = 0;
        for (int i = this.index; i < this.values.length; i++){
            if (checkPrimeNumber(this.values[i])) {
                tmp = this.values[i];
                this.index = i + 1;
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

    /**
     * @param number
     * @return true if number is prime
     */
    public boolean checkPrimeNumber(int number) {
        boolean result = true;
        if (number < 2) {
            result = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++){
                if (number % i == 0){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
