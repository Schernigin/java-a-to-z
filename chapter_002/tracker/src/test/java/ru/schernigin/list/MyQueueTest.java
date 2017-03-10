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
    public void whenCallMethodAddThenQueueNoNull() {

        this.queue.add("1");
        this.queue.add("2");
        this.queue.get();

        assertThat(this.queue.get(), is("2"));
    }

    @Test
    public void whenCallMethodShowFirstThenShowFirstValueQueue() {
        this.queue.add("1");
        this.queue.add("2");
        this.queue.add("3");

        assertThat(this.queue.showFirst(), is("1"));
    }

    @Test
    public void whenCallMethodGetSizeThenSizeQueue() {
        this.queue.add("1");
        this.queue.add("1");
        this.queue.add("1");

        assertThat(this.queue.getSize(), is(3));
    }

}