package ru.schernigin.calculator;

/**
*  Class. 
*  @author schernigin.
*  @since 23.11.2016.
*  @version 1.
*/

public class Calculate {

	private double result;

	/**
	 * 
	 * @param first. 
	 * @param second. 
	 * @return result.
	 */

	public void add (double first, double second) {
		this.result = first + second;
	}

	/**
	 * 
	 * @param first. 
	 * @param second. 
	 * @return result.
	 */

	public void substruct (double first, double second) {
		this.result = first - second;
	}

	/**
	 * 
	 * @param first. 
	 * @param second. 
	 * @return result.
	 */

	public void div (double first, double second) {
		this.result = first / second;
	}

	/**
	 * 
	 * @param first. 
	 * @param second. 
	 * @return result.
	 */

	public void multiply (double first, double second) {
		this.result = first * second;
	}

	/**
	 * 
	 * @return result.
	 */

	public double getResult() {
		return this.result;
	}

}