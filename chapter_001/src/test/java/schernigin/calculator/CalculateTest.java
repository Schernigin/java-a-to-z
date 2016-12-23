package schernigin.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

	 /**
	 * Test.
	 *
	 * @author schernigin.
	 * @version 1
	 * @since 28.11.2016
	 */

public class CalculateTest {

	Calculate calc = new Calculate();

	/**
	 * Test add.
	 */

	@Test
	public void whenFirstAndSecondThenSumm() {
		final double checked = 4d;
		final double second = 2d; 
		final double first = 2d;

		calc.add(first, second);

		final double result = calc.getResult();
	}


	/**
	 * Test substruct.
	 */

	@Test
	public void whenFirstAndSecondThenDifference() {
		final double checked = 3d;
		final double second = 3d; 
		final double first = 6d;

		calc.substruct(first, second);

		final double result = calc.getResult();
	}

	/**
	 * Test div.
	 */

	@Test
	public void whenFirstAndSecondThenPrivate() {
		final double checked = 2d;
		final double second = 6d; 
		final double first = 12d;

		calc.div(first, second);

		final double result = calc.getResult();
	}

	/**
	 * Test multiply.
	 */

	@Test
	public void whenFirstAndSecondThenComposition() {
		final double checked = 25d;
		final double second = 5d; 
		final double first = 5d;

		calc.add(first, second);

		final double result = calc.getResult();
	}
}
