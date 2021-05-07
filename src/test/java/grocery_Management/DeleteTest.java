package grocery_Management;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteTest {
	@Test
	//known item
	public void test1() {
		String item="milk";
		boolean isDeleted=GroceryAppDelete.deleteItem(item);
		assertTrue(isDeleted);
	}
	@Test
	//unknown item
	public void test2() {
		String item="rice";
		boolean isDeleted=GroceryAppDelete.deleteItem(item);
		assertTrue(isDeleted);
	}
	@Test
	//Case check
	public void test3() {
		String item="MilK";
		boolean isDeleted=GroceryAppDelete.deleteItem(item);
		assertTrue(isDeleted);
	}
	@Test
	//space check
	public void test4() {
		String item="   MilK    ";
		boolean isDeleted=GroceryAppDelete.deleteItem(item);
		assertTrue(isDeleted);
	}

}
