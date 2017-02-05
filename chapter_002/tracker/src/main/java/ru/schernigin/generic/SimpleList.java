package ru.schernigin.generic;

/**
 * class SimpleList.
 * @author schernigin
 * @since 02.02.2017
 * @version 1.0
 */
public class SimpleList<T> {

    /**
     * internal field.
     */

    Object[] objects;

    /**
     * internal field.
     */

    int index = 0;

    /**
     * this constructor sets the length of the array.
     * @param size length array.
     */

    public SimpleList(int size) {
        this.objects = new Object[size];
    }

    /**
     * add value to the array.
     * @param value type
     */

    public void add(T value) {
        this.objects[index++] = value;
    }

    /**
     * returns value of a specific cell.
     * @param index array.
     * @return value.
     */

    public T get(int index) {
        return (T) this.objects[index];
    }

    /**
     * update of a specific cell.
     * @param index array.
     * @param value new.
     */

    public void update(int index, T value) {
        this.objects[index] = value;
    }

    /**
     * delete a specific cell.
     * @param index array.
     */

    public void delete(int index) {
        this.objects[index] = null;
    }
}
