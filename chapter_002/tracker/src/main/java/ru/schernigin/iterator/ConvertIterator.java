package ru.schernigin.iterator;//package ru.schernigin.services;

//import java.util.Iterator;

import ru.schernigin.services.UseIterator;

import java.util.Iterator;

/**
 * CLass ConvertIterator.
 * @author schernigin
 * @since 31.01.2017
 * @version 1.0
 */
public class ConvertIterator implements UseIterator, Iterator<Integer> {

    /**
     * external iterator
     */

    private Iterator<Iterator<Integer>> it;

    /**
     * inner iterator
     */

    private Iterator<Integer> inner;

    public  Iterator<Integer> convert(Iterator<Iterator<Integer>>it){
        this.it = it;
        if (it.hasNext()) {
            this.inner = it.next();
        }
        return this;
    }


    @Override
    public boolean hasNext() {
        return it.hasNext() || inner.hasNext();
    }

    @Override
    public Integer next() {
        Integer result;
        if (inner.hasNext()) {
            result = inner.next();
        } else {
            inner = it.next();
            result = inner.next();
        }
        return result;
    }

    @Override
    public void remove() {

    }
}
