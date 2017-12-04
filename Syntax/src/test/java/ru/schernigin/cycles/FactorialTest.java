package ru.schernigin.cycles;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Test class Factorial.
 *
 * @author schernigin.
 * @version 1
 * @since 04.12.2016
 */

public class FactorialTest {

	/**
	 * Test method factorial.
	 */
	
	@Test
	public void whenAddValueThenFactorial() {
		final Factorial fact = new Factorial();

		final int checked = 120;
		final int value = 5;
		
		final int result = fact.factorial(value);

		assertThat(result, is (checked));
	}

	@Test
	public void whenAddValueZeroThenFactorialOne() {
		final Factorial fact = new Factorial();

		final int checked = 1;
		final int value = 0;
		
		final int result = fact.factorial(value);

		assertThat(result, is (checked));
	}
}
