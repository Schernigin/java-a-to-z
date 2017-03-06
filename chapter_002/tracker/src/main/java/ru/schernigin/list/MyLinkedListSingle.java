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
    private Node<E> element;

    /**
     * list size.
     */
    private int size = -1;


    /**
     * method to add value
     * @param value list
     */
    @Override
    public void add(E value) {

        if (isEmpty(this.element)) {
            this.element = new Node<E>(value, null);
        } else {
            Node<E> elem = new Node<E>(value, null);
            this.element.next = elem;
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
        Node<E> elem = this.element;
        MyIterator iterator = new MyIterator();
        int counter = 0;
            if (this.size >= index && index > -1) {
                while (counter != index) {
                    elem.item = iterator.next();
                    counter++;
                }
            } else {
                throw new NoSuchElementException();
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
            return element.next != null;
        }

        /**
         * @return list value, and shifts the carriage to the right.
         */
        @Override
        public E next() {
            E value = element.item;
            element = element.next;
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
