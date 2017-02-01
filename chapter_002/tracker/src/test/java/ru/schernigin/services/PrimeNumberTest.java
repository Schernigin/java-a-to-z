package ru.schernigin.services;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by USER on 01.02.2017.
 */
public class PrimeNumberTest {

    @Test
    public void whenUsePrimeNumberThenReturnPrimeNumbers() {
        PrimeNumber it = new PrimeNumber(new int[] {1, 4, 5});

        int result = (Integer) it.next();

        assertThat(result, is(5));
    }

    @Test
    public void whenUseTwicePrimeNumberThenReturnPrimeNumber() {
        PrimeNumber it = new PrimeNumber(new int[] {5, 4, 7});

        it.next();
        int result = (Integer) it.next();

        assertThat(result, is(7));
    }

    @Test
    public void whenAddNumberThenReturnTrueIfNumberPrime() {
        PrimeNumber it = new PrimeNumber(new int[] {});

        boolean result = it.checkPrimeNumber(5);

        assertThat(result, is(true));
    }

    @Test
    public void whenAddNumberThenReturnFalseIfNumberNotPrime() {
        PrimeNumber it = new PrimeNumber(new int[] {});

        boolean result = it.checkPrimeNumber(4);

        assertThat(result, is(false));
    }

    @Test
    public void whenInArrayPrimeNumberThenReturnTrue() {
        PrimeNumber it = new PrimeNumber(new int[] {1,5});

        it.next();
        boolean result = it.hasNext();

        assertThat(result, is(true));
    }

    @Test
    public void whenInArrayNotPrimeNumberThenReturnFalse() {
        PrimeNumber it = new PrimeNumber(new int[] {1,6});

        it.next();
        boolean result = it.hasNext();

        assertThat(result, is(false));
    }

}