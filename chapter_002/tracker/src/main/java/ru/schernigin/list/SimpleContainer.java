package ru.schernigin.list;

/**
 * Interface SimpleContainer.
 * @author schernigin
 * @since 8.02.2017
 * @version 1.0
 */

public interface SimpleContainer<E> extends Iterable<E>{
    void add(E e);
    E get(int index);
    boolean isEmpty(Object o);
}
