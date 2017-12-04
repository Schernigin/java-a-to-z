package ru.schernigin;

/**
 * class AsynchOperations
 *
 * @author schernigin.
 * @since 09.04.2017.
 * @version 1.0
 */
public class AsynchOperations {

    public static final class Calculate implements Runnable {
        private final String name;

        public Calculate(String name) {
            this.name = name;
        }

        public void run() {
            System.out.println(String.format("%s TODO asynch", this.name));
        }
    }

    public static void main(String[] args) {
        System.out.println("start");
        new Thread(new Calculate("tread 1")).start();
        System.out.println("finish");
    }
}
