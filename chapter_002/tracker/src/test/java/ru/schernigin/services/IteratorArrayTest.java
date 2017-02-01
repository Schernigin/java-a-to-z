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






}