package ru.schernigin.map;

import java.util.Calendar;

/**
 * Class where the "equals" method is redefined.
 * @author schernigin.
 * @since 01.03.2017.
 * @version 1.0
 */
public class UserE extends User {
    /**
     * constructor.
     *
     * @param name     name.
     * @param children children.
     * @param birthday birthday
     */
    public UserE(String name, int children, Calendar birthday) {
        super(name, children, birthday);
    }

    /**
     * @param obj inner.
     * @return true if all field equals.
     */
    @Override
    public boolean equals(Object obj) {
        UserE user = (UserE) obj;
        return getName().equals(user.getName())
                && getBirthday().equals(user.getBirthday())
                && getChildren() == user.getChildren();
    }
}
