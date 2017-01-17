package ru.schernigin.models;

/**
 * class Item.
 * @author schernigin.
 * @sienc 15.12.2016
 * @version 1.0
 */

public class Item {

	/**
	* id item.
	*/
	private String id;

	/**
	* name item.
	*/
	
	private String name;
	
	/**
	* description item.
	*/

	private String description;
	
	/**
	* time item.
	*/

	private long create;
	
	/**
	* default constructor item.
	*/ 

	public Item() {
	}

	/**
	* constructor item.
	* @param name item.
	* @param description item.
	* @param time item.
	*/
	public Item(String name, String description, long create) {
		this.name = name;
		this.description = description;
		this.create = create;
	}
	
	/**
	* This method returns the name of the element
	*/

	public String getName() {
		return this.name;
	}
	
	/**
	* This method sets the item name.
	*/
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	* This method returns the description of the element.
	*/

	public String getDescription() {
		return this.description;
	}
	
	/**
	* This method sets the item description.
	*/
	
	public void setDescription(String desc) {
		this.description = desc;
	}
	
	/**
	* This method returns the time create of the element.
	*/

	public long getCreate() {
		return this.create;
	}
	
	/**
	* This method sets the time create item.
	*/
	
	public void setCreate(long a) {
		this.create = a;
	}

	/**
	* This method returns the id of the element.
	*/
	public String getId() {
		return this.id;
	}

	/**
	* This method sets the item id.
	*/
	public void setId(String id) {
		this.id = id;
	}
}