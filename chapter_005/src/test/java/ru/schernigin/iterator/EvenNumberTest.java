package ru.schernigin.iterator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class EvenNumberTest
 * Author schernigin
 * Sence 01.02.2017
 * Version 1.0
 */
public class EvenNumberTest {

    @Test
    public void whenUseEvenNumberThenReturnEorvenNumbers() {
        EvenNumber it = new EvenNumber(new int[] {3, 1, 4});

        int result = (Integer) it.next();

        assertThat(result, is(4));
    }

    @Test
    public void whenUseTwiceEvenNumberThenReturnEorvenNumbers() {
        EvenNumber it = new EvenNumber(new int[] {2, 1, 4});

        it.next();
        int result = (Integer) it.next();

        assertThat(result, is(4));
    }

    @Test
    public void whenUseEvenNumberThenReturnZero() {
        EvenNumber it = new EvenNumber(new int[] {3, 1, 5});

        int result = (Integer) it.next();

        assertThat(result, is(0));
    }

    @Test
    public void whenCheckFollowingPozitiveNumberThwnReturnTrue() {
        EvenNumber it = new EvenNumber(new int[] {2, 1, 4});

        it.next();
        boolean result = it.hasNext();

        assertThat(result, is(true));
    }

    @Test
    public void whenCheckFollowingPozitiveNumberThwnReturnFalse() {
        EvenNumber it = new EvenNumber(new int[] {2, 1, 3});

        it.next();
        boolean result = it.hasNext();

        assertThat(result, is(false));
    }

    @Test
    public void whenCheckPozitiveNumberThwnReturnTrue() {
        EvenNumber it = new EvenNumber(new int[] {2, 1});

        boolean result = it.hasNext();

        assertThat(result, is(true));
    }

    @Test
    public void whenCheckPozitiveNumberThwnReturnFalse() {
        EvenNumber it = new EvenNumber(new int[] {3, 1});

        boolean result = it.hasNext();

        assertThat(result, is(false));
    }

    @Test
    public void whenDeleteIndexThenIndexEqualsNull() {
        EvenNumber it = new EvenNumber(new int[] {3, 1, 2});

        it.next();
        it.remove();
        it.next();
        int result = it.next();

        assertThat(result, is(0));
    }

}