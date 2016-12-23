package schernigin.square;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class Point Test.
 *
 * @author schernigin.
 * @version 1
 * @since 03.12.2016
 */

public class PointTest {

	/**
	 * Test method distanceTo.
	 *
	 */	

	@Test
	public void whenAddTwoPointThenDistance() {
		
		Point pointX = new Point(1d, 0d);
		Point pointY = new Point(0d, 0d);

		double checked = 1d;

		double result = pointX.distanceTo(pointY);

		assertThat(result, is(checked));
	}
}