package ru.schernigin.list;

import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * class MyLinkedList.
 * @author schernigin.
 * @since 09.02.2017
 * @version 1.0
 */
public class MyLinkedList<E> implements SimpleContainer<E> {

    /**
     * reference to the first element.
     */
    private Record first;

    /**
     * reference to the last element.
     */
    private  Record last;

    /**
     * the value of the length of the list.
     */
    int size = 0;

    /**
     * adds value to the list.
     * @param value in list.
     */
    @Override
    public void add(E value) {
        if (isEmpty(this.first)) {
            this.first = new Record<E>(value, this.first, this.first);
        } else {
            if (isEmpty(this.last)) {
                Record<E> record = new Record<E>(value, this.first, null);
                this.last = record;
                this.first.next = record;
            } else {
                Record<E> record = new Record<E>(value, this.last, null);
                this.last.next = record;
                this.last = record;
            }
        }

        this.size++;
    }

    /**
     * returns a value from a list.
     * @param index value.
     * @return element list.
     */
    @Override
    public E get(int index) {
        int counter = 0;
        Record<E> element = this.first;
        while (counter != index) {
            element = element.next;
            counter++;
        }
        return element.item;
    }

    /**
     * @return iterator;
     */
    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    /**
     * @return true if first no null.
     */
    public boolean isEmpty(Object o) {
        return o == null;
    }

    /**
     * @return size;
     */

    public int getSize() {
        return this.size;
    }

    /**
     * class to create instances in which are stored the values of the list and links to the previous and next value.
     * @param <E>
     */
    private class Record<E> {

        /**
         * value to element.
         */
        private E item;
        /**
         * reference for next element.
         */
        private Record<E> next;
        /**
         * reference for previous element.
         */
        private Record<E> previous;

        /**
         * constructor.
         * @param element list.
         * @param next for next.
         * @param previous for previous.
         */
        public Record(E element, Record<E> previous, Record<E> next ) {

            this.item = element;
            this.previous = previous;
            this.next = next;
        }
    }

    /**
     * class iterator.
     */
    private class MyIterator implements Iterator{

        /**
         * @return true if the list contains values.
         */
        @Override
        public boolean hasNext() {
            return last.next != null;
        }

        /**
         * @return next element.
         */
        @Override
        public E next() {
            E value = (E) first.item;
            first = first.next;
            return value;
        }

        /**
         * delete element.
         */
        @Override
        public void remove() {

        }
    }
}

