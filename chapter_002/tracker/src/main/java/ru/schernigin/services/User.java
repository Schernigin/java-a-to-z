package ru.schernigin.services;

/**
 * class User.
 * @author schernigin
 * @since 03.02.2017
 * @version 1.0
 */
public class User<T> extends Base {

    private String id;

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
