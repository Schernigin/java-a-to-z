package ru.schernigin.list;

/**
 * Created by USER on 07.03.2017.
 */
public class MyQueue<E> implements InerfaceSQ<E> {

    private Node<E> first;

    private int size = 0;
    @Override
    public void add(E value) {
        if (isEmpty(this.first)) {
            this.first = new Node<E>(value, null);
        } else {
            Node<E> element = new Node<E>(value, null);
                if (isEmpty(this.first.prev)) {
                    this.first.prev = element;
                } else {
                    element.prev = element;
                }
        }
        this.size++;

    }

    @Override
    public E get() {
        E value = this.first.item;
        this.first = this.first.prev;
        return value;
    }

    @Override
    public boolean isEmpty(Object o) {
        return o == null;
    }

    private class Node<E> {

        /**
         * stack value;
         */
        private E item;

        /**
         * reference to next value.
         */
        private Node<E> prev;

        /**
         * constructor.
         * @param value stack.
         * @param prev reference.
         */
        public Node(E value, Node<E> prev) {

            this.item = value;
            this.prev = prev;
        }

    }
}
