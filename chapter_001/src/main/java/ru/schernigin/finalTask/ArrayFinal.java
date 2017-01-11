package ru.schernigin.finalTask;

/**
 * class ArrayFinal.
 * @author schernigin.
 * @since 08.01.2017.
 * @version 1.
 */

public class ArrayFinal { 


	/**
	* This method checks if the array is sorted(from smallest to largest).
	* @param array
	* @return true (if sorted)
	*/
	
	public boolean check(int[] array) {
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > array[i + 1]) {
				break;
			} else {
				counter++;			
			}
		} 
		return array.length == counter;
	}
	
	/**
	* This method combines the two arrays and sorts them.(from smallest to largest).
	* @param array arrOne
	* @param array arrTwo
	* @return combined sorted array
	*/
		
	public int[] combineArrays (int arrOne[], int arrTwo[]) {
		int[] arrTemp = new int[arrOne.length + arrTwo.length];
		int index = 0;
		for(int i = 0; i < arrTemp.length; i += 2) {
			if(arrOne[index] > arrTwo[index]) {
				arrTemp[i + 1] = arrOne[index];
				arrTemp[i] = arrTwo[index]; 				
			} else {
				arrTemp[i] = arrOne[index];
				arrTemp[i + 1] = arrTwo[index];
			}
			index++;
		}
		return arrTemp;
	}
}