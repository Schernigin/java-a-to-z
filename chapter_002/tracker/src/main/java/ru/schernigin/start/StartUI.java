package ru.schernigin.start;

import ru.schernigin.models.*;

public class StartUI {
	private Input input;
	
	public StartUI(Input input) {
		this.input = input;
	}	

	
	public void init() {
		Tracker tracker = new Tracker();
		MenuTracker menu = new MenuTracker(tracker, this.input);
		menu.fillActions();
		do {
			menu.showMenu();
			int key = Integer.valueOf(input.ask("Select:"));
			menu.select(key);
		} while (!"y".equals(this.input.ask("Exit?: (y)")));
	} 

	public static void main(String[] args)  {
		Input input = new ConsoleInput();
		new StartUI(input).init();
	}
}