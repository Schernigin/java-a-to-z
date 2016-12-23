package schernigin.square;

/**
 * class to find the maximum number of two and three numbers
 *
 * @author schernigin.
 * @version 1
 * @since 01.12.2016
 */

public class Max {

	/**
	*
	* method for finding the maximum number of.
	* param first.
	* param second.
	* result max.
	*/

	public int maxTwo(int first, int second) {
		return first > second ? first : second;
	}

	/**
	*
	* method to find the maximum number of three numbers
	* param first.
	* param second.
	* param three.
	* result max.
	*/	

	public int maxThree(int first, int second, int three) {
		return maxTwo(maxTwo(first, second), three);
	}

	
}