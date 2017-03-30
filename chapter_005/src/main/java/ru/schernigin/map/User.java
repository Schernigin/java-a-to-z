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

    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();

        Map<User, Object> map = new HashMap();

        User user1 = new User("Sergey", 2, calendar);
        User user2 = new User("Sergey", 2, calendar);
        User user3 = new User("Sergey", 2, calendar);

        map.put(user1, new Object());
        map.put(user2, new Object());
        map.put(user3, new Object());

        System.out.print(map);
    }
}
