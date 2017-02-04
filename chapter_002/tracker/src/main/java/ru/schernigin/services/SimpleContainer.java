package ru.schernigin.services;

/**
 * Created by USER on 04.02.2017.
 */
public interface SimpleContainer<E> extends Iterable<E>{
    void add(E e);
    E get(int index);
}
