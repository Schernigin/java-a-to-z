package schernigin.square;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class to find the maximum number of two and three numbers
 *
 * @author schernigin.
 * @version 1
 * @since 01.12.2016
 */

public class MaxTest { 

	/**
	 * Test maxTwo.
	 */

	Max maximum = new Max();

	@Test
	public void whenAddTwoValuesThenReturnMax() { 
		final int checked = 3;
		final int first = 3;	
		final int second = 1;

		maximum.maxTwo(first, second);

		final int result = first;
	}

	/**
	 * Test maxTwo.
	 */

	@Test
	public void wehenfirstAndSecondThenMax() { 
		final int checked = 4;
		final int first = 2;	
		final int second = 4;

		maximum.maxTwo(first, second);

		final int result = second;
	}

	/**
	 * Test maxThree.
	 */

	@Test
	public void wehenFirstAndSecondAndTrheeThenMax() {
		final int checked = 5;
		final int first = 2;	
		final int second = 5;
		final int three = 1;

		maximum.maxThree(first, second, three);

		final int result = second;
	}

	/**
	 * Test maxThree.
	 */

	@Test
	public void whenAddTheeValuesThenReturnMax() {
		final int checked = 8;
		final int first = 8;	
		final int second = 3;
		final int three = 1;

		maximum.maxThree(first, second, three);

		final int result = first;
	}

	/**
	 * Test maxThree.
	 */

	@Test
	public void whenAddTheeValuesThenReturnTheMax() {
		final int checked = 9;
		final int first = 8;	
		final int second = 3;
		final int three = 9;

		maximum.maxThree(first, second, three);

		final int result = three;
	}
}