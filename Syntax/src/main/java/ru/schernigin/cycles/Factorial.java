package ru.schernigin.cycles;

/**
* Class Factorial.
* @autor schernigin.
* @since 04.12.2016
* @version 1.
*/

public class Factorial {

	/**
	* the method computes the factorial.
	* @param value.
	* @return result
	*/

	public int factorial(int value) {
		int result = 1;
	
		if(value < 0) {
			System.out.println("factorial considered only from the natural numbers");
		} 
		if (value == 0) {
			return result;
		} else {
			for(int i = 1; i <= value; i++) {
				result *= i;
			}
		}
		
		return result;
	}
}