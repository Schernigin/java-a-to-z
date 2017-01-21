package ru.schernigin.models;

/**
* the Class Comments.
* @author Schernigin.
* @since 21.01.2017
* @version 1.0
*/

public class Comments {
	
	/*
	* the private fild for class Commments.
	*/
	
	private String comment;
	
	/**
	* Default constructor for the class Comment.     
	*/
	public  Comments() {
	}
	
    /**
     * Constructor for the class Comment.
     * @param comment for the Constructor.
     */

    public Comments(String comment) {
        this.comment = comment;
    }
        
        /**
        * Getter for the field "comment".
        * @return comment
        */
     public String getComment() {
         return comment;
     }

    /**
     * Setter for the field "comment".
     * @param comment of Comment
     */
        
     public void setComment(String comment) {
         this.comment = comment;
     }
}