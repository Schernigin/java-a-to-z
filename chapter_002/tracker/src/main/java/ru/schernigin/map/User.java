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
     * @param name
     * @param children
     * @param birthday
     */
    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }

    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();

        Map<User, String> map = new HashMap();

        map.put(new User("Sergey", 2, calendar), "1");
        map.put(new User("Sergey", 2, calendar), "2");
        map.put(new User("Sergey", 2, calendar), "3");

        System.out.println(map);
    }




}
