package ru.schernigin.start;

import static org.mockito.Mockito.*;
import ru.schernigin.models.*;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test class Tracker.
 *
 * @author schernigin.
 * @version 1
 * @since 06.01.2017
 */

public class TrackerTest {

	/*
	* this array used in the tests.
	*/
	
	private Item[] items = new Item[2];
	
	/*
	* Objects for test.
	*/
	
	Item item = new Item(null, null, 0);
	Item expected = new Item (null, null, 0);
	Tracker track = new Tracker();
	track.add(item);
	track.add(expected);
	
	/*
	* Test method add.
	*/

	@Test
	public void when_add_item_then_new_item_and_new_id() {
		Comparable c = mock(Comparable.class);
		when(c.compareTo("Test")).thenReturn(1);
		assertEquals(1, c.compareTo("Test"));
	}
	
	/*
	* Test Generate Id.
	*/
	
	@Test
	public void when_generate_id_then_new_id() {
		Comparable c = mock(Comparable.class);
		when(c.compareTo("Test")).thenReturn(1);
		assertEquals(1, c.compareTo("Test"));
	}
	
	/*
	* Test method update.
	*/
	
	@Test
	public void when_replase_item_then_item_update() {
		item.setName("ivanov");
		item.setDescription("vse pochinil");
		item.setCreate(2);
		track.update(item);
		assertThat(item.getName, is(expected.getName));
		assertThat(item.getDescription, is(expected.getDescription));
		assertThat(item.getCreate, is(expected.getCreate));
	}
	
	/*
	* Test method update.
	*/
	
	@Test
	public void when_take_item_and_use_delite_then_item_equalse_null() {
		track.delite(item);
		assertThat(item.getName, is(expected.getName));
		assertThat(item.getDescription, is(expected.getDescription));
		assertThat(item.getCreate, is(expected.getCreate));
	}

}