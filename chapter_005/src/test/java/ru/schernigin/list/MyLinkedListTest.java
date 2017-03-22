package ru.schernigin.list;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * class MyLinkedListTest.
 * @author schernigin.
 * @since 23.02.2017.
 * @version 1.0
 */
public class MyLinkedListTest {

    @Test
    public void whenAddElementInListThenNevElement() {
        MyLinkedList<String> mylist = new MyLinkedList<String>();

        mylist.add("1");
        mylist.add("2");
        mylist.add("3");

        assertThat(mylist.get(1), is("2"));
    }

    @Test
    public void whenCallMethodGetThenReturnValueElementList() {
        MyLinkedList<String> mylist = new MyLinkedList<String>();

        mylist.add("hello");

        String result = mylist.get(0);

        assertThat(result, is("hello"));
    }

    @Test
    public void whenCallMethodGetSizeThenReturnSizeList() {
        MyLinkedList<String> mylist = new MyLinkedList<String>();

        mylist.add("1");
        mylist.add("2");
        mylist.add("3");

        assertThat(mylist.getSize(), is(3));
    }

}