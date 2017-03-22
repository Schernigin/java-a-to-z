package ru.schernigin.generic;

/**
 * interface Store.
 * @author schernigin
 * @since 03.02.2017
 * @version 1.0
 */
public interface Store<T extends Base> {

    void add(T value);

    T get(String id);

    void update(String id, T value);

    void  delete(String id);
}
