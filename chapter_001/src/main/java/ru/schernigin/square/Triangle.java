package schernigin.square;

import static java.lang.Math.max;

/**
 * calculating the area of a triangle class.
 *
 * @author schernigin.
 * @version 1
 * @since 28.11.2016
 */

public class Triangle {

	/**
	* This variable describes the vertex of the triangle.
	*/

	private Point a;

	/**
	* This variable describes the vertex of the triangle.
	*/

	private Point b;

	/**
	* This variable describes the vertex of the triangle.
	*/

	private Point c;

	/**
	* 
	* It is constructor for class Triangle.
	* @param a is the first vertex of the triangle.
	* @param a is the second vertex of the triangle.
	* @param a is the third vertex of the triangle.
	*/

	public Triangle(final Point a1, final Point b1, final Point c1) {
		this.a = a1;
		this.b = b1;
		this.c = c1;
	}
	
	/**
	* 
	* calculating the area of a triangle method.
	* @param ab triangle side length.
	* @param bc triangle side length.
	* @param ca triangle side length.
	* @param p triangle semiperimeter.
	* return area triangle.
	*/	

	public double area() throws Exception {
	double sideAB = this.a.distanceTo(this.b);
	double sideAC = this.a.distanceTo(this.c);
	double sideBC = this.b.distanceTo(this.c);

	if ((sideAB >= sideAC + sideBC) && (sideAC >= sideAB + sideBC) && (sideBC >= sideAC + sideAB)) {
		throw new Exception("It is impossible to construct a triangle with these vertices");
	}

	double properiter = (sideAB + sideAC + sideBC) / 2;

	return Math.sqrt(properiter * (properiter - sideAB) * (properiter - sideAC) * (properiter - sideBC));
	}
}