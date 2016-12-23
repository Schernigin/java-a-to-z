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
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i].equals(array[j])) {
					array[j] = null;
					String temp = array[j];
					array[j] = array[array.length - 1];
					array[array.length - 1] = temp;
					String[] arrNew = new String [array.length - 1];
					array = Arrays.copyOf(array, arrNew.length);
				}
			}
		}
		return array;
	}
}