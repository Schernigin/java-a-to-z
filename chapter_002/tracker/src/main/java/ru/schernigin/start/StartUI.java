package ru.schernigin.start;

import ru.schernigin.models.*;

public class StartUI {
	private Input input;
	
	public StartUI(Input input) {
		this.input = input;
	}
	
	public void init() {
		String name = input.ask("Please enter the taks's name: ");
		Tracker tracker = new Tracker();
		tracker.add(new Item(name, "first desc", 1));
		for (Item item : tracker.getAll()) {
			System.out.println(item.getName());
		}	
	}

	public static void main(String[] args)  {
		//Input input = new StubInput(new String[] {"creat stub task"})
		Input input = new ConsoleInput();
		new StartUI(input).init();
	}
}