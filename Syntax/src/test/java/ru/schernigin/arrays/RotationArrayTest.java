package ru.schernigin.arrays;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class rotation array.
 *
 * @author schernigin.
 * @version 1
 * @since 05.12.2016
 */

public class RotationArrayTest {

	/**
	* Test mrthod rotation.
	*/

	@Test
	public void whenAddTwoDimensionalArrayThenInvertedArray90Degrees() {
		RotationArray rot = new RotationArray();
		final int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		final int[][] arrRot = {{3, 6, 9}, {2, 5, 8}, {1, 4, 7}};
		final int[][] resultArr = rot.rotation(arr);
		assertThat(resultArr, is(arrRot));
	}
}