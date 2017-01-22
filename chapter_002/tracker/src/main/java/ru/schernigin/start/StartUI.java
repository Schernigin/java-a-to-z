package ru.schernigin.start;

import ru.schernigin.models.*;

public class StartUI {
	private Input input;
	
	private String inMenu;
	
	private String[] menu = {"1 New item", "2 show all items", "3 update item", "4 find the item on behalf of the", "5 find the item on id of the", "6 find the item on the description", "7 delete item", "8 add comment", "9 exsit"};
	
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
		} while (!"y".equals(this.input.ask("Exit? y")));
	} 

	public static void main(String[] args)  {
		Input input = new ConsoleInput();
		new StartUI(input).init();
	}
}