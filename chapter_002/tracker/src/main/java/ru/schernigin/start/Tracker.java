package ru.schernigin.start;

import ru.schernigin.models.*;
import java.util.*;

/**
 * class Tracker.
 * @author schernigin.
 * @sienc 15.12.2016
 * @version 1.0
 */

public class Tracker {

	/**
	* this array item.
	*/
	
	private Item[] items = new Item[10];
	
	/**
	* this initialization position
	*/
	
	private int position = 0;
	
	/**
	* constant to generate ID.
	*/
	
	private static final Random RN = new Random();
	
	/**
	* method to add item.
	*/
	
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[position++] = item;
		return item;
	}

	/**
	* method to generate ID and convert a string of digits
	*/
	
	String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	}
	
	/**
	* method to replace item.
	*/
	
	public void update(Item item) {
		for (int i = 0; i < this.items.length; i++) {
			if (this.items[i] != null && this.items[i].getId().equals(item.getId())) {
				this.items[i] = item;
				break;
			}
		}
	}
 
 	/**
	* method to remove the item.
	*/
	
	public void delete(Item item) {
		for (int i = 0; i < this.items.length; i++) {
			if (this.items[i] != null && this.items[i].getId().equals(item.getId())) {
				this.items[i] = null;
			}
		}
	}
	
	/**
	* method of finding item by id.
	*/
	
	protected Item findById(String id) {
		Item result = null;
		for (Item item : items) {
			if(item != null && item.getId().equals(id)) {
				result = item;
				break;
			}
		}
		return result;
	}
	
	/**
	* method of finding item by name.
	*/
	
	protected Item findByName(String name) {
		Item result = null;
		for (Item item : items) {
			if(item != null && item.getName().equals(name)) {
				result = item;
				break;
			}
		}
		return result;
	}
	
	/**
	* method to get the list of all item.
	*/
	
	public Item[] getAll() {
		Item[] result = new Item[position];
		for (int index = 0; index != this.position; index++) {
			result[index] = this.items[index];
		}
		return result;
	}
	


}