package schernigin.arrays;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class Duplecates.
 *
 * @author schernigin.
 * @version 1
 * @since 08.12.2016
 */

public class DuplicatesTest {

	/**
	 * this method removes the duplicates in the array.
	 */

	@Test
	public void whenAddArrayThenArrayDuplicatesDelite() {
		Duplicates del = new Duplicates();
		final String[] arr = {"Hello", "Hello", "world", "world"};
		final String[] arrDel = {"Hello", "world"};
		final String[] result = del.delite(arr);
		assertThat(result, is(arrDel));
	}
}