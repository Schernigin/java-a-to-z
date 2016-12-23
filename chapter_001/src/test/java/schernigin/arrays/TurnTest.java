package schernigin.arrays;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class Tuen.
 *
 * @author schernigin.
 * @version 1
 * @since 05.12.2016
 */

public class TurnTest {

	/**
	* Test method back.
	*/

	@Test
	public void whenAddAruuyThenArrayeInverted() {
		Turn turn = new Turn();
		final int[] array = {1, 2, 3};
		final int[] endArray = {3, 2, 1};
		final int[] resultArray = turn.back(array);
		assertThat(resultArray, is(endArray));
				
	}
}