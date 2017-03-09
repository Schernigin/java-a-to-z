package ru.schernigin.list;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by USER on 07.03.2017.
 */
public class MyQueueTest {

    MyQueue<String> queue = new MyQueue<String>();

    @Test
    public void whenCallMethodAddThenQueueNoNull() {
        this.queue.add("1");
        this.queue.add("2");
        this.queue.add("3");
        this.queue.add("4");

        System.out.println(this.queue.get());
        System.out.println(this.queue.get());
        System.out.println(this.queue.get());
        System.out.println(this.queue.get());
    }

}