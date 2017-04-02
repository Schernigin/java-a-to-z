package ru.schernigin.map;

import java.util.Calendar;

/**
 * Class where the "hashCode" and "equals" method is redefined.
 * @author schernigin.
 * @since 01.03.2017.
 * @version 1.0
 */
public class UserEH extends User {
    /**
     * constructor.
     *
     * @param name     name.
     * @param children children.
     * @param birthday birthday
     */
    public UserEH(String name, int children, Calendar birthday) {
        super(name, children, birthday);
    }

    /**
     * @return hashCode object;
     */
    @Override
    public int hashCode() {
        int result = 15;
        result = result * 21 + getName().hashCode();
        result = result * 21 + getBirthday().hashCode();
        result = result * 21 + getChildren();
        return result;
    }

    /**
     * @param obj inner.
     * @return true if all field equals.
     */
    @Override
    public boolean equals(Object obj) {
        UserEH user = (UserEH) obj;
        return getName().equals(user.getName())
                && getBirthday().equals(user.getBirthday())
                && getChildren() == user.getChildren();
    }
}
