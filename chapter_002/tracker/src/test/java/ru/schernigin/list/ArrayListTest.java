package ru.schernigin.list;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * class ArrayListTest.
 * @author schernigin
 * @since 8.02.2017
 * @version 1.0
 */
public class ArrayListTest {

    @Test
    public void whenAddRecordThenRecord() {
        ArrayList<String> arr = new  ArrayList();

        arr.add("Test");

        assertThat(arr.get(0), Is.<Object>is("Test"));
    }


}