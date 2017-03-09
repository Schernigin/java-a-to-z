package ru.schernigin.list;

/**
 * Class Stack.
 * @author Schernigin.
 * @since  06.03.2017.
 * @version 1.0
 */
public class MyStack<E> implements InerfaceSQ<E> {

    /**
     * reference to first stack value.
     */
    private Node<E> first;

    /**
     * size stack.
     */
    private int size = 0;


    /**
     * add value in stack.
     * @param value first.
     */
    @Override
    public void add(E value) {
        if (isEmpty(this.first)) {
            this.first = new Node<E>(value, null);
        } else {
            Node<E> element = new Node<E>(value, null);
            element.next = this.first;
            this.first = element;
        }
        this.size++;
    }

    /**
     * @return first value and delete this.
     */
    @Override
    public E get() {
        E value = this.first.item;
        this.first.item = null;
        this.first = this.first.next;
        if (value != null) {
            this.size--;
            return value;
        } else {
            throw new NullPointerException("this Stack null");
        }
    }

    /**
     * @return show first value.
     */
    public E showFirst() {
        return this.first.item;
    }

    /**
     * @return true if first null
     */
    @Override
    public boolean isEmpty(Object o) {
        return o== null;
    }

    public int getSize() {
        return this.size;
    }

    /**
     * Class Node.
     * @param <E>
     */
    private class Node<E> {

        /**
         * stack value;
         */
        private E item;

        /**
         * reference to next value.
         */
        private Node<E> next;

        /**
         * constructor.
         * @param value stack.
         * @param next reference.
         */
        public Node(E value, Node<E> next) {

            this.item = value;
            this.next = next;
        }

    }
}
