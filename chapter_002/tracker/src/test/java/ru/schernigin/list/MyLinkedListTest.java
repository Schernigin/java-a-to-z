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

        mylist.add("Hello");
        mylist.add("Sergey");
        mylist.add("House");


        System.out.println(mylist.get(1));
    }
}