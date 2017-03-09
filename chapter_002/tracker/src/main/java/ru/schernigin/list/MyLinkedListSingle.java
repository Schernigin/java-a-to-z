package ru.schernigin.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class My Linked List Single.
 * @author Schernigin.
 * @since 03.03.2017
 * @version 1.0
 */
public class MyLinkedListSingle<E> implements SimpleContainer<E> {

    /**
     * a reference to the first value.
     */
    private Node<E> first;

    private Node<E> next;

    /**
     * list size.
     */
    private int size = 0;


    /**
     * method to add value
     * @param value list
     */
    @Override
    public void add(E value) {
        if (isEmpty(this.first)) {
            this.first = new Node<E>(value, this.first);
        } else if (isEmpty(this.next)) {
            this.next = new Node<E>(value, null);
            this.first.next = this.next;
        } else {
            this.next.next = new Node<E>(value, null);
            this.next = this.next.next;
        }
        this.size++;
    }

    /**
     * return value to index.
     * @param index value.
     * @return list value.
     */
    @Override
    public E get(int index) {
        Node<E> elem = this.first;
        int counter = 0;
        while (counter != index) {
            elem = elem.next;
            counter++;
        }
        return elem.item;
    }

    /**
     * @param o object.
     * @return true if object the null.
     */
    @Override
    public boolean isEmpty(Object o) {
        return o == null;
    }

    /**
     * @return object iterator.
     */
    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    /**
     * Class Iterator.
     */
    private class MyIterator implements Iterator {

        /**
         * @return true if reference no null.
         */
        @Override
        public boolean hasNext() {
            return first.next != null;
        }

        /**
         * @return list value, and shifts the carriage to the right.
         */
        @Override
        public E next() {
            E value = first.item;
            first = first.next;
            return value;
        }

        @Override
        public void remove() {

        }
    }

    /**
     * class node.
     * @param <E>
     */
    private class Node<E> {

        /**
         * list value.
         */
        private E item;

        /**
         * reference to next value.
         */
        private Node<E> next;


        /**
         * constructor.
         * @param value list.
         * @param next reference.
         */
        public Node(E value, Node<E> next) {

            this.item = value;
            this.next = next;
        }
    }
}
