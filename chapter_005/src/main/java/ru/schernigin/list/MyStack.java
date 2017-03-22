package ru.schernigin.list;

/**
 * Class Stack.
 * @author Schernigin.
 * @since  06.03.2017.
 * @version 1.0
 */
public class MyStack<E> extends MyLinkedList<E> {

    /**
     * Added value.
     * @param value
     */
    public void push(E value) {
        super.add(value);
    }

    /**
     * @return the last value added.
     */
    public E pool() {
        return super.get(super.getSize() - 1);
    }

}
