package ru.schernigin.start;

public class StartUITest {
	public static void main(String[] args) {
		Input input = new StubInput(new String[] {"create new item"});	
		new StartUI(input).init();
	}
}