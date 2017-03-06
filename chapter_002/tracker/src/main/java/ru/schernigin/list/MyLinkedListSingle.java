package ru.schernigin.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by USER on 03.03.2017.
 */
public class MyLinkedListSingle<E> implements SimpleContainer<E> {

    private Node<E> element;

    private int size = -1;


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

    @Override
    public boolean isEmpty(Object o) {
        return o == null;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return element.next != null;
        }

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

    private class Node<E> {

        private E item;

        private Node<E> next;


        public Node(E value, Node<E> next) {

            this.item = value;
            this.next = next;
        }
    }
}
