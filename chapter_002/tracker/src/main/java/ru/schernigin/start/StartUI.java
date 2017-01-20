package ru.schernigin.start;

import ru.schernigin.models.*;

public class StartUI {
	private Input input;
	
	private String inMenu;
	
	private String[] menu = {"Hello! MENU:", "1 New item", "2 show all items", "3 update item", "4 find the item on behalf of the", "5 find the item on id of the", "6 find the item on the description", "7 delete item", "8 exsit"};
	
	public StartUI(Input input) {
		this.input = input;
	}	
			
	public String showMenu(){
		for(String i : this.menu) {
			System.out.println(i);
		}
		this.inMenu = input.ask("select the menu item, eg: 3");		
		return this.inMenu;
	}
	
	public void select() {
		for(String i : this.menu) {
			boolean firstValue;
			if(firstValue) {
				firstValue = this.menu[i].startsWith("1");
				new StartUI(input).init();
			}	
		}
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
		Input input = new ConsoleInput();
		new StartUI(input).showMenu();
	}
}