package ru.schernigin.map;

import java.util.*;

/**
 *  User Class to map realization.
 * @author schernigin.
 * @since 13.02.2017.
 * @version 1.0
 */

public class User {

    /**
     * inner field name.
     */
    private final String name;

    /**
     * inner field children.
     */
    private int children;

    /**
     * inner field birthday.
     */
    private final Calendar birthday;

    /**
     * constructor.
     * @param name name.
     * @param children children.
     * @param birthday birthday
     */

    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }


    public String getName() {
        return name;
    }

    public int getChildren() {
        return children;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return name;
    }
}
