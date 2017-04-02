package ru.schernigin.start;

import ru.schernigin.models.*;

public class StartUI {
	private Input input;
	private Tracker tracker;


	private int[] range = new int[] {0, 1, 2, 3, 4, 5, 6};

	public StartUI(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}	

	
	public void init() {
		MenuTracker menu = new MenuTracker(tracker, this.input);
		menu.fillActions();
		do {
			menu.showMenu();
			menu.select(input.ask("select : ", range));
		} while (!"y".equals(this.input.ask("Exit? (y/n): ")));
	} 

	public static void main(String[] args)  {
		Input input = new ValidateInput();
		new StartUI(input, new Tracker()).init();
	}
}