package ru.schernigin.start;

import java.util.*;

public class ConsoleInput implements Input {
	private Scanner scanner = new Scanner(System.in);
	
	public String ask(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}

	public int ask(String question, int[] renge) {
		int key = Integer.valueOf(this.ask(question));
		boolean exist = false;
		for (int value : renge) {
			if (value == key) {
				exist = true;
				break;
			}
		}
		if (exist){
			return key;
		} else {
			throw new MenuOutException("Out of menu range.");
		}
	}
}