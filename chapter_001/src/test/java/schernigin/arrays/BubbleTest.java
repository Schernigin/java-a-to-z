package ru.schernigin.arrays;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class Bubble.
 *
 * @author schernigin.
 * @version 1
 * @since 05.12.2016
 */

public class BubbleTest {

	/**
	* Test mrthod bubbleSort.
	*/
	
	@Test
	public void whenAddArrayThenArraySortBubble() {
		Bubble bub = new Bubble();
		final int[] arrayUnsorted = {4, 2, 3, 5, 1, 8, 9, 7, 11, 10, 6};
		final int[] arraySorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		final int[] resultArray = bub.bubbleSort(arrayUnsorted);
		assertThat(resultArray, is(arraySorted));

	}
}