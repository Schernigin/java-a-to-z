package ru.schernigin.start;

/**
 * class ValidateInput
 * author Schernigin
 * since 26.01.2017
 * version 1.0
 */
public class ValidateInput extends ConsoleInput {
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                return super.ask(question, range);
            } catch (MenuOutException moe) {
                System.out.println("Pliase select key from menu");
            } catch (NumberFormatException nfe) {
                System.out.println("Pliase enter validate date again");
            }
        } while (invalid);
        return  value;
    }
}
