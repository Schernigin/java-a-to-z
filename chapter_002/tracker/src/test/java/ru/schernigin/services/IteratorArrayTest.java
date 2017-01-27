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
        IteratorArray it = new IteratorArray(new int[] {1, 3, 5, 2});

        int result = (Integer) it.iteratEorvenNumbers();

        assertThat(result, is(2));
    }

    @Test
    public void whenUseIteratEorvenNumbersThenReturnFalse() {
        IteratorArray it = new IteratorArray(new int[] {1, 2, 1, 5});

        int result = (Integer) it.iteratorPrimes();

        assertThat(result, is(5));
    }

}