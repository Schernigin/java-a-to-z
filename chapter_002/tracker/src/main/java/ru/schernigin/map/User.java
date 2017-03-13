package ru.schernigin.map;

import java.util.Calendar;

/**
 *  User Class to map realization  .
 * @author schernigin.
 * @since 13.02.2017.
 * @version 1.0
 */
public class User {

    /**
     * inner field name.
     */
    private String name;

    /**
     * inner field children.
     */
    private int children;

    /**
     * inner field birthday.
     */
    private Calendar birthday;

    /**
     * constructor.
     * @param name
     * @param children
     * @param birthday
     */
    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }
}
