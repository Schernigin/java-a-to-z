package ru.schernigin.list;

import java.util.Arrays;
import java.util.Iterator;

/**
 * class ArrayList.
 * @author schernigin
 * @since 8.02.2017
 * @version 1.0
 */

public class ArrayList<E> implements SimpleContainer {


    /**
     *
     */
    private E[] array;

    /**
     *
     */
    private int size = 100;

    /**
     *
     */
    private int index = 0;

    /**
     * @param array
     */
   // public ArrayList(E[] array) {
    //    this.array[size] = (E) array;
   // }

    /**
     * this method add record.
     * @param e
     */
    @Override
    public void add(Object e) {
        if (this.hasNext()){
            this.array = Arrays.copyOf(this.array, this.size + 100);
            this.array[index++] = (E) e;
        } else {
            this.array[index++] = (E) e;
        }
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
     * @return
     */
    public boolean hasNext() {
        return this.array.length > this.size;
    }

    /**
     * @return
     */
    @Override
    public Iterator iterator() {
        return null;
    }
}
