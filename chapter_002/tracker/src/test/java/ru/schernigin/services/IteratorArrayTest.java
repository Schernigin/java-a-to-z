package ru.schernigin.services;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class Iterator Array
 * Author schernigin
 * Sence 26.01.2017
 * Version 1.0
 */
public class IteratorArrayTest {

    public static class ForEachArray implements Iterable {

        private final int[] values;

        public ForEachArray(int[] values) {
            this.values = values;
        }

        public Iterator iterator() {
            return new IteratorArray(this.values);
        }
    }

    @Test
    public void whenGetNextCallSholdPointerForward() {
        IteratorArray it = new IteratorArray(new int[] {1, 3});

        it.next();
        int result = (Integer) it.next();

        assertThat(result, is(3));
    }

    @Test
    public void whenCheckNextPositionSholdReturnContantValue() {
        IteratorArray it = new IteratorArray(new int[] {1});

        it.next();
        boolean result = it.hasNext();

        assertThat(result, is(false));
    }

    @Test
    public void whenUseIteratEorvenNumbersThenReturnEorvenNumbers() {
        IteratorArray it = new IteratorArray(new int[] {2, 1, 4});

        it.next();
        int result = (Integer) it.next();

        assertThat(result, is(4));
    }

    @Test
    public void whenInTheArrayHasNoPositiveNumberThenWillBeZero() {
        IteratorArray it = new IteratorArray(new int[] {1, 3, 5, 3});

        int result = (Integer) it.next();

        assertThat(result, is(0));
    }

    @Test
    public void whenEnterNumberThenIfNumberPrimeReturnTrue() {
       IteratorArray it = new IteratorArray(new int[] {});

       it.checkPrimeNumber(3);
       boolean result = true;

        assertThat(result, is(true));
    }

    @Test
    public void whenEnterNumberThenIfNumberNotPrimeReturnFalse() {
        IteratorArray it = new IteratorArray(new int[] {});

        it.checkPrimeNumber(4);
        boolean result = false;

        assertThat(result, is(false));
    }

    @Test
    public void WhenInTheArrayIsAPrimeNumberThenThisMethodShouldReturnIt() {
        IteratorArray it = new IteratorArray(new int[] {1, 1, 6, 7});

        int result = it.iteratorPrime();

        assertThat(result, is(7));
    }

}