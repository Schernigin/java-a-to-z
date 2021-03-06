package ru.schernigin.start;

import static org.mockito.Mockito.*;
import ru.schernigin.models.*;
import java.util.*;
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
	* Test method add.
	*/

	@Test
	public void whenAddThenNewItem() {
		Tracker tracker = new Tracker();
		Item item = new Item("first", "description");
		Item result = tracker.add(item);
		assertThat(result, is(item));

	}
	
	/*
	* Test Generate Id.
	*/
	
	@Test
	public void whenGenerateIdThenNewId() {
		Comparable c = mock(Comparable.class);
		when(c.compareTo("Test")).thenReturn(1);
		assertEquals(1, c.compareTo("Test"));
	}
	
	/*
	* Test method update.
	*/
	
	@Test
	public void whenUpdateThenItemUpdate() {
		Tracker tracker = new Tracker();
		Item item = new Item("second", "description2");
		tracker.update(item);
		assertThat(item.getName(), is("second"));
		assertThat(item.getDescription(), is("description2"));

	}
	
	/*
	* Test remove (delete).
	*/
	
	@Test
	public void whenDeleteThenItemEqualsNull(){
		Tracker tracker = new Tracker();
		Item item = new Item("second", "description2");
		tracker.add(item);
		tracker.delete(item); 
		Item expected = null;
		assertThat(tracker.findById(item.getId()), is(expected));	
	}

	/*
	* Test findByName.
	*/
		
	@Test
	public void whenFindByNameTwenReturnItemName() {
		Tracker tracker = new Tracker();
		Item item = new Item("first", "description1");
		Item item1 = new Item("second", "description2");
		Item item2 = new Item("third", "description3");
		tracker.add(item);
		tracker.add(item1);
		tracker.add(item2);
		assertThat(tracker.findByName("second"), is(item1));
	}
	
	
	/*
	* Test findById.
	*/
	
	@Test
	public void whenFindByIdThenReturnId() {
		Tracker tracker = new Tracker();
		Item item = new Item("first", "description1");
		Item item1 = new Item("second", "description2");
		Item item2 = new Item("third", "description3");
		tracker.add(item);
		tracker.add(item1);
		tracker.add(item2);
		assertThat(tracker.findById(item2.getId()), is(item2));
	} 
	
	/*
	* Test getAll.
	*/
	
	@Test
	public void whenGetAllThenReturnAllArrayItems() {
		Tracker tracker = new Tracker();
		Item item = new Item("first", "description1");
		Item item1 = new Item("second", "description2");
		Item item2 = new Item("third", "description3");
		tracker.add(item);
		tracker.add(item1);
		tracker.add(item2);
		final List<Item> checked = new ArrayList<Item>();
		checked.add(item);
		checked.add(item1);
		checked.add(item2);
		List<Item> result = tracker.getAll();
		assertThat(result, is(checked));
	}
	
	
	
	
	
	
	
	
	
	
	
}