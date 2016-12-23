package schernigin.cycles;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Test class Counter
 *
 * @author schernigin.
 * @version 1
 * @since 01.12.2016
 */

public class CounterTest {

	/**
	 * Test add.
	 */
	
	@Test
	public void whenAddStartAndFinishThentheSumOfPositiveNumbers() {
		final Counter counter = new Counter();

		final int checked = 6;
		final int start = 0;
		final int finish = 6;

		final int result = counter.add(start, finish);

		assertThat(result, is(checked));
	}
}