package ru.schernigin.start;

import ru.schernigin.models.Comments;
import ru.schernigin.models.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * class Tracker.
 * @author schernigin.
 * @since 15.12.2016
 * @version 1.0
 */

public class Tracker {

	/**
	* this array item.
	*/
	
	private List<Item> items = new ArrayList<Item>();
	
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
		this.items.set(position++, item);
		return item;
	}

	/**
	 *This method add new comment for the Item.
	 *@return item with added comment
	 * @param id is Item's id
	 * @param comment for Item
	 */

	public Item addComment(String id, Comments comment) {
		Item item = this.findById(id);
		item.addComments(comment);
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
		for (int i = 0; i < this.items.size(); i++) {
			if (this.items.get(i) != null && this.items.get(i).getId().equals(item.getId())) {
				this.items.set(i, item);
				break;
			}
		}
	}
 
 	/**
	* method to remove the item.
	*/
	
	public void delete(Item item) {
		for (int i = 0; i < this.items.size(); i++) {
			if (this.items.get(i) != null && this.items.get(i).getId().equals(item.getId())) {
				this.items.set(i, null);
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
			result[index] = this.items.get(index);
		}
		return result;
	}

}