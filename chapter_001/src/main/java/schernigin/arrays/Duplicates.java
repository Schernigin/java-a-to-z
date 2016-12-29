package schernigin.arrays;

import java.util.Arrays;


/**
 * Class Duplicates
 * @author schernigin
 * @since 8.12.16.
 * @version 1.
 */

public class Duplicates {

	/**
	 * method duplicates (This method removes duplicates in the array)
	 * @param array
	 * @return array updated.
	 */

	public String[] delite(String[] array) {
		
		int counter = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length - i - 1; j++) {
				if(array[i].equals(array[j])) {
					array[j] = null;
					counter ++;
				}
			}
		}
		String[] arrNew = new String [array.length - counter];
		array = Arrays.copyOf(array, arrNew.length);
		return array;
	}
}