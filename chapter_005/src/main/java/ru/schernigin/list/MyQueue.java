package ru.schernigin.list;

/**
 *Class MyQueue.
 * @author Schernigin.
 * @since  06.03.2017.
 * @version 1.0
 */
public class MyQueue<E>  extends MyLinkedList<E> implements InerfaceSQ<E>{

    MyLinkedList<E> forQueue = new MyLinkedList<E>();

    /**
     * Added value.
     * @param value value.
     */
    public void push(E value) {
        super.add(value);
    }

    /**
     * @return the first value added.
     */
    public E pool() {
        E tmp = super.get(0);
        forQueue.removeFirt();
        return tmp;
    }
}
