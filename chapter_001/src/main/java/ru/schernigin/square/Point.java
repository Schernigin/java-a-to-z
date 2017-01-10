package schernigin.square;

import static java.lang.Math.max;




/**
 * class for finding points.
 *
 * @author schernigin.
 * @version 1
 * @since 28.11.2016
 */

public class Point {

	private double x;
	private double y;

	/**
	 * 
	 * constructor.
	 */
	
	public Point(final double x1, final double y1) {
		this.x = x1;
		this.y = y1;
	}
	

	/**
	 * 
	 * Finding the distance between two points method.
	 */

	public double distanceTo(Point point) {
		return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
	}


}