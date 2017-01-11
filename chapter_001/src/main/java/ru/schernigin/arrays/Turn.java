package ru.schernigin.arrays;

/**
* Class Turn
* @autor schernigin.
* @since 04.12.2016.
* @version 1.
*/

public class Turn {
	
	/**
	* method flip the array.
	* @param array.
	* @return inverted array.
	*/


	public int[] back(int[] array) {
		for(int i = 0; i < array.length / 2; i++){
			int tmp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = tmp;
		}
		return array;
	}
}