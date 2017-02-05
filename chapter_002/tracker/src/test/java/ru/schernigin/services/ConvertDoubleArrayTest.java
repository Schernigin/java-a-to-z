package ru.schernigin.services;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * CLass ConvertDoubleArrayTest.
 * @author schernigin
 * @since 04.02.2017
 * @version 1.0
 */
public class ConvertDoubleArrayTest {

    @Test
    public void whenAddDoubleArrayThenReturnNextIndex() {

        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        ConvertDoubleArray con = new ConvertDoubleArray(array);

        con.next();
        con.next();
        int result = con.next();

        assertThat(result, is(3));

    }

}