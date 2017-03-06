package ru.schernigin.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by USER on 03.03.2017.
 */
public class MyLinkedListSingleTest {

    MyLinkedListSingle<String> list = new MyLinkedListSingle<String>();

    @Test
    public void whenAddItemInListThenListNoNull() {
        list.add("Hello");
        list.add("By");
        list.add("Welcome");
        list.add("World");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        //assertThat(list.get(1), is("By"));
    }



}