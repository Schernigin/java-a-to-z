package ru.schernigin.list;

import java.util.Arrays;
import java.util.Iterator;

/**
 * class MyArrayList.
 * @author schernigin
 * @since 8.02.2017
 * @version 1.0
 */

public class MyArrayList<E> implements SimpleContainer {


    /**
     * inner array.
     */
    private Object[] array;

    /**
     * size to array.
     */
    private static final int size = 100;

    /**
     * index array.
     */
    private int index = 0;

    /**
     *
     */
    public MyArrayList(int size) {
        this.array = new Object[size];
    }

    public MyArrayList() {
        this(size);
    }

    /**
     * this method add record.
     * @param e
     */
    @Override
    public void add(Object e) {
        if (this.hasNext()){
            newLength();
            this.array[index++] = (E) e;
        } else {
            this.array[index++] = (E) e;
        }
    }

    /**
     * the method increases the length of the array.
     */
    private void newLength() {
        this.array = Arrays.copyOf(this.array, (this.size * 3) / 2 + 1);
    }


    /**
     * This method checks whether there is still value in the array
     * @param index
     * @return boolean.
     */
    @Override
    public Object get(int index) {
        return this.array[index];
    }


    /**
     * @return true if no null.
     */
    public boolean hasNext() {
        return this.array[array.length - 1] != null ;
    }

    /**
     * @return
     */
    @Override
    public Iterator iterator() {
        return null;
    }
}
