package schernigin.finalTask;

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
			if (i <= i + 1) {
				counter++;
			} else {
				break;
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
		for(int i = 0; i < arrTemp.length; i++) {
			int index = 0;
			if(arrOne[index] > arrTwo[index]) {
				arrOne[index] = arrTemp[i + 1];
				arrTwo[index] = arrTemp[i];				
			} else {
				arrOne[index] = arrTemp[i];
				arrTwo[index] = arrTemp[i + 1];
			}
			i += 2;
			index++;
		}
		return arrTemp;
	}
}