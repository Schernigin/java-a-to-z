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
	* Test method add.
	*/

	@Test
	public void whenAddThenNewItem() {
		Tracker tracker = new Tracker();
		Item item = new Item("first", "description", 1);
		tracker.add(item);
		assertThat(item.getName(), is("first"));
		assertThat(item.getDescription(), is("description"));
		assertThat(item.getCreate(), is(1L));
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
		Item item = new Item("second", "description2", 2);
		tracker.update(item);
		assertThat(item.getName(), is("second"));
		assertThat(item.getDescription(), is("description2"));
		assertThat(item.getCreate(), is(2L));
	}
	
	/*
	* Test remove (delete).
	*/
	
//	@Test
//	public void whenDeleteThenItemEqualsNull(){
//		Tracker tracker = new Tracker();
//		Item item = new Item("second", "description2", 2);
//		assertThat();
		
	}

	/*
	* Test findByName.
	*/
		
	@Test
	public void whenFindByIDTwenReturnItemId() {
		Tracker tracker = new Tracker();
		Item item = new Item("first", "description1", 1);
		Item item1 = new Item("second", "description2", 2);
		Item item2 = new Item("third", "description3", 3);
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
		Item item = new Item("first", "description1", 1);
		Item item1 = new Item("second", "description2", 2);
		Item item2 = new Item("third", "description3", 3);
		tracker.add(item);
		tracker.add(item1);
		tracker.add(item2);
		assertThat(tracker.findById(item2.getId()), is(item2));
	} 
	
	/*
	* Test getAll.
	*/
	
//	@Test
//	public void whenGetAllThenReturnAllArrayItems() {
//		assertThat()
//	}
}