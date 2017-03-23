package ru.schernigin.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 *Class QueueTest.
 * @author Schernigin.
 * @since  06.03.2017.
 * @version 1.0
 */
public class MyQueueTest {

    private MyQueue<String> queue = new MyQueue<String>();

    @Test
    public void whenCallAddThenQueueNoNull() {
        MyQueue<String> test = new MyQueue<String>();

        test.push("1");

        assertThat(test.pool(), is("1"));
    }

    @Test
    public void whenCallPoolThenReturnFirstAddedValue() {
        MyQueue<String> test = new MyQueue<String>();

        test.push("1");
        test.push("2");
        test.push("3");
        test.push("4");
        String result = test.pool();

        assertThat(result, is("1"));
    }
}