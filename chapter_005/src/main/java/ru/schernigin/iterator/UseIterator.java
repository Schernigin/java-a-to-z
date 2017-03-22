package ru.schernigin.iterator;

import java.util.Iterator;

/**
 *
 */
public interface UseIterator {

    Iterator <Integer> convert(Iterator<Iterator<Integer>>it);
}