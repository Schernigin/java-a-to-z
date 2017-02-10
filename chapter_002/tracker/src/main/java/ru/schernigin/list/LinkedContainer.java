package ru.schernigin.list;

/**
 * interface Linked Container.
 * @author schernigin
 * @since 09.02.2017
 * @version 1.0
 */
public interface LinkedContainer<E> extends Iterable<E> {
    void push (E e);
    E pull();
}
