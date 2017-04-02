package ru.schernigin.cycles;

/**
*  class Counter. 
*  @author schernigin.
*  @since 03.12.2016.
*  @version 1.
*/

public class Counter {

	/**
	*  metod for calculating the sum of even numbers in a certain range.
	* @param start range start.
	* @param finish end of the range.
	* return sum.
	*/

	public int add(int start, int finish) {
		int sum = 0;
		for(int i = start; i < finish; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}