package ru.schernigin.start;

/**
 * Class UserAction.
 * author Schernigin
 * since 21.01.2017.
 * version 1.0
 */
public interface UserAction {
    int key();

    void execute(Input input, Tracker tracker);

    String info();
}
