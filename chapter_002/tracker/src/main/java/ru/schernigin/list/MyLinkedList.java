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

        Record<E> element = new Record(value, this.first, this.last);
            element.item = value;
            if (this.last == null) {
                this.first = element;
                this.last = this.first;
            } else {
                this.last.next = element;
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
        Record<E> elem = this.first;
        if (index < this.size && size != -1) {
            elem = elem.next;
        } else {
            throw new NoSuchElementException();
        }
        return elem.item;
    }

    /**
     * @return iterator;
     */
    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    /**
     * class to create instances in which are stored the values of the list and links to the previous and next value.
     * @param <E>
     */
    private class Record<E> {

        /**
         * reference for element.
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
        public Record(E element, Record<E> next, Record<E> previous) {

            this.item = element;
            this.next = next;
            this.previous = previous;
        }
    }

    /**
     * class iterator.
     */
    private class MyIterator implements Iterator{

        /**
         * index
         */
        private int index = 0;

        /**
         * @return true if the list contains values.
         */
        @Override
        public boolean hasNext() {
            return this.index < size;
        }

        /**
         * @return next element.
         */
        @Override
        public E next() {
            if (this.index < size) {
                return get(index++);
            } else {
                throw new NoSuchElementException();
            }
        }

        /**
         * delete element.
         */
        @Override
        public void remove() {

        }
    }
}

