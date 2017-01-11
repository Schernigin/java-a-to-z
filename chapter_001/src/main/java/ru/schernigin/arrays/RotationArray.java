package ru.schernigin.arrays;

/**
* class Rotation array.
* @autor schernigin.
* @since 08.12.2012.
* @version 1.
*/

public class RotationArray {

	/**
	* method array rotation.
	* @param array
	* @return array sort.
	*/

	public int[][] rotation(int[][] array) {

		for(int i = 0; i < array.length / 2; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				int tmp = array[i][j];
				array[i][j] = array[j][array.length - i - 1];
				array[j][array.length - i - 1] = array[array.length - i - 1][array.length - j - 1];
				array[array.length - i - 1][array.length - j - 1] = array[array.length - j - 1][i];
				array[array.length - j - 1][i] = tmp;
			}
		}
		return array;
	}
}