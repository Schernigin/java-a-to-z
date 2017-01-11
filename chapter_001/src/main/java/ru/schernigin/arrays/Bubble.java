package ru.schernigin.arrays;

/**
* class Bubble.
* @author schernigin.
* @since 05.12.2016.
* @version 1.
*/

public class Bubble {

	/**
	* method sort bubble.
	* @param array
	* @return array sort.
	*/

	public int[] bubbleSort(int[] array) {
	
		for(int i = 0; i <= array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int t = array[i];
					array[i] = array[j];
					array[j] = t;
				}
			}
		}
		return array;
	}

}