package ru.schernigin.generic;

import java.util.NoSuchElementException;

/**
 * class absract BaseStore.
 * @author schernigin
 * @since 06.02.2017
 * @version 1.0
 */
public abstract class BaseStore<T extends Base> implements Store<T> {

    /**
     * the internal value of the specified size of the array.
     */
    private final int size = 10;

    /**
     * interior object.
     */
    private SimpleArray<T> storage = new SimpleArray<T>(size);

    /**
     * this method add record.
     * @param value
     */
    @Override
    public void add(T value) {
        this.storage.add(value);
    }

    /**
     * this method get record.
     * @param id
     * @return
     */
    @Override
    public T get(String id) {
        return this.storage.get(findById(id));
    }

    /**
     * this method update record.
     * @param id
     * @param value
     */
    @Override
    public void update(String id, T value) {
        this.storage.update(findById(id), value);
    }

    /**
     * this method delete record.
     * @param id
     */
    @Override
    public void delete(String id) {
        this.storage.delete(findById(id));
    }

    /**
     * this method find id.
     * @param id
     * @return id.
     */
    private Integer findById(String id) {
        int result = -1;
        for (int i = 0; i < size; i++) {
            if (this.storage.get(i) != null && this.storage.get(i).getId().equals(id)) {
                result = i;
                break;
            } if (result == -1){
                throw new NoSuchElementException("such  element not  is  found ");
            }
        }
        return result;
    }
}
