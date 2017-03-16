package ru.schernigin.list;

/**
 *Class MyQueue.
 * @author Schernigin.
 * @since  06.03.2017.
 * @version 1.0
 */
public class MyQueue<E>  extends MyLinkedList<E> {

    public void push(E value) {
        super.add(value);
    }

    public E pool() {
        return super.get(0);
    }

}
