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
        this.stack.add("1");
        this.stack.add("2");
        this.stack.add("3");
        this.stack.add("4");
        this.stack.add("5");
        this.stack.get();
        this.stack.get();

        assertThat(this.stack.get(), is("3"));
    }

    @Test
    public void whenGetValueStackThenReturnValue() {
        this.stack.add("1");

        String result = this.stack.get();

        assertThat(result, is("1"));
    }

    @Test
    public void whenGetSizeThenReturnSizeStack() {
        this.stack.add("1");
        this.stack.add("3");
        this.stack.add("9");

        assertThat(this.stack.getSize(), is(3));
    }

    @Test
    public void whenCallMethodIsEmptyThenReturnFalseIfNoNull() {
        this.stack.add("1");
        assertThat(this.stack.isEmpty(this.stack), is(false));
    }

    @Test
    public void whenCallMethodShowFirstThenReturnFirstValueToStack() {
        this.stack.add("1");
        this.stack.add("2");
        this.stack.add("3");

        assertThat(this.stack.showFirst(), is("3"));
    }

}