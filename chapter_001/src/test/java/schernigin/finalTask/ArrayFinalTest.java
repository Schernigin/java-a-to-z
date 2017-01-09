package schernigin.finalTask;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class ArrayFinal.
 *
 * @author schernigin.
 * @version 1
 * @since 08.01.2017
 */
 
public class ArrayFinalTest {

	/**
	 * This method checks if the array is sorted.
	 */
	 
	 @Test
	 public void whenAddArrayThenTrueIfTheArrayIsSorted() {
	 	ArrayFinal checkArray = new ArrayFinal();
	 	final int[] arr = {1, 2, 3, 4};
	 	final boolean expect = true;
	 	final boolean result = checkArray.check(arr);
	 	assertThat(result, is(expect));
	 }
	 
	 /**
	 * This method checks if the array is not sorted.
	 */
	 
	 @Test
	 public void whenAddArrayThenFalseIfTheArrayIsNotSorted() {
	 	ArrayFinal checkArray = new ArrayFinal();
	 	final int[] arr = {4, 2, 3, 1};
	 	final boolean expect = false;
	 	final boolean result = checkArray.check(arr);
	 	assertThat(result, is(expect));
	 }
	 
	 /**
	 * This method combines two arrays and sorts them
	 */
	 
	 @Test
	 public void whenAddTwoArraysThenOneArraySorted() {
	 	ArrayFinal comb = new ArrayFinal();
	 	final int[] arrOne = {2, 4, 7, 9};
	 	final int[] arrTwo = {1, 5, 8, 10};
	 	final int[] arrTemp = {1, 2, 4, 5, 7, 8, 9, 10};
	 	final int[] result = comb.combineArrays(arrOne, arrTwo);
	 	assertThat(result, is(arrTemp));
	 } 
	 
	 
	 
	 
}