package ru.schernigin.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * class MyStackTest
 * @author Schernigin
 * @since  06.03.2017.
 * @version 1.0
 */
public class MyStackTest {

    private MyStack<String> stack = new MyStack<String>();

    @Test
    public void whenAddValueStackThenStackNoNull() {
        MyStack<String> test = new MyStack<String>();

        test.push("1");

        assertThat(test.pool(), is("1"));
    }

    @Test
    public void whenGetValueStackThenStackNoNull() {
        MyStack<String> test = new MyStack<String>();

        test.add("1");
        test.add("2");

        assertThat(test.pool(), is("2"));
    }
}