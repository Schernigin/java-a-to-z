package ru.schernigin.list;

import java.util.Iterator;

/**
 * class LinkedList.
 * @author schernigin
 * @since 09.02.2017
 * @version 1.0
 */
public class LinkedList<E> implements LinkedContainer<E> {

    private Record<E> first;

    private Record<E> last;

    private int size = 0;

    public LinkedList() {
    }

    @Override
    public void push(E element) {

    }

    @Override
    public E pull() {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    private class Record<E> {

        E element;

        Record<E> next;

        Record<E> prev;

        Record(E element, Record<E> next, Record<E> prev) {

            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}

