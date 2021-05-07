package grocery_Management;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddQuantityTest {
	@Test
	//known item
	public void test1() {
		String item="bread";
		int quantity=10;
		boolean isQuantityAdded=GroceryAppAddQuantity.addQuantity(item, quantity);
		assertTrue(isQuantityAdded);
	}
	@Test
	//unknown item
	public void test2() {
		String item="wheat";
		int quantity=10;
		boolean isQuantityAdded=GroceryAppAddQuantity.addQuantity(item, quantity);
		assertFalse(isQuantityAdded);
	}
	@Test
	//Adding negative quantity
	public void test3() {
		String item="milk";
		int quantity=-1;
		boolean isQuantityAdded=GroceryAppAddQuantity.addQuantity(item, quantity);
		assertFalse(isQuantityAdded);
	}
	@Test
	//case check
	public void test4() {
		String item="miLK";
		int quantity=5;
		boolean isQuantityAdded=GroceryAppAddQuantity.addQuantity(item, quantity);
		assertTrue(isQuantityAdded);
	}
	@Test
	//space check
	public void test5() {
		String item="milk  ";
		int quantity=10;
		boolean isQuantityAdded=GroceryAppAddQuantity.addQuantity(item, quantity);
		assertTrue(isQuantityAdded);
	}
	}
