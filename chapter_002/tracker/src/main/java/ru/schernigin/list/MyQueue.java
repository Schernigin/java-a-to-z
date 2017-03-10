package ru.schernigin.list;

/**
 *Class MyQueue.
 * @author Schernigin.
 * @since  06.03.2017.
 * @version 1.0
 */
public class MyQueue<E> implements InerfaceSQ<E> {

    /**
     * reference first value to queue.
     */
    private Node<E> first;

    /**
     * reference last value to queue.
     */
    private Node<E> last;

    /**
     * size queue.
     */
    private int size = 0;

    /**
     * add value in queue.
     * @param value queue.
     */
    @Override
    public void add(E value) {
        if (isEmpty(this.first)) {
            this.first = new Node<E>(value, null);
        } else if (isEmpty(this.last)){
            this.last = new Node<E>(value, null);
            this.first.prev = this.last;
        } else {
            Node<E> element = new Node<E>(value, null);
            this.last.prev = element;
            this.last = element;
        }
        this.size++;
    }

    /**
     * @return value queue, and delete first value.
     */
    @Override
    public E get() {
        E value = this.first.item;
        this.first.item = null;
        this.first = this.first.prev;
        this.size--;
        return value;
    }

    /**
     * @return size queue.
     */
    public int getSize() {
        return this.size;
    }

    /**
     * @return show first value.
     */
    public E showFirst() {
        return this.first.item;
    }

    /**
     * @param o object.
     * @return true if object is null.
     */
    @Override
    public boolean isEmpty(Object o) {
        return o == null;
    }

    /**
     * class Node to store a value and a reference to neighboring values.
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
