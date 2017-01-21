package ru.schernigin.models;

import java.util.*;


/**
 * class Item.
 * @author schernigin.
 * @since 15.12.2016
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
	* date item.
	*/

	private Date createDate;
	
	/**
	* default constructor item.
	*/ 

	public Item() {
	}
	
	/*
	* array for comments.
	*/
	
	private List<Comments> comments = new ArrayList<Comments>();
	

	/**
	* constructor item.
	* @param name item.
	* @param description item.
	 */
	public Item(String name, String description) {
		this.name = name;
		this.description = description;
		this.createDate = new Date();
	}
	
	/*
	* this method return the comment of the item.
	*/
	
	public List<Comments> getAllComments() {
		return this.comments;
	}
		
	/*
	* this method add new comment.
	*/
	
	public void addComments(Comments comment) {
		this.comments.add(comment);
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

	public Date getCreateDate() {
		return this.createDate;
	}
	
	/**
	* This method sets the time create item.
	*/
	
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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