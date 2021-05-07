package grocery_Management;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddItemTest {

	@Test
	//unknown item
	public void test1() {
		String item="rice";
		double price=50.0;
		int quantity=40;
		boolean isAdded=GroceryAppAddItem.addItem(item, price,quantity);
		assertTrue(isAdded);
	}
	@Test
	//known item
	public void test2() {
		String item="wheat";
		double price=40.0;
		int quantity=30;
		boolean isAdded=GroceryAppAddItem.addItem(item, price,quantity);
		assertFalse(isAdded);
	}
	@Test
	//without name
	public void test3() {
		String item="";
		double price=50.0;
		int quantity=40;
		boolean isAdded=GroceryAppAddItem.addItem(item, price,quantity);
		assertFalse(isAdded);
	}
	@Test
	//negative price
	public void test4() {
		String item="ragi";
		double price=-1.0;
		int quantity=30;
		boolean isAdded=GroceryAppAddItem.addItem(item, price,quantity);
		assertFalse(isAdded);
	}
	@Test
	//negative quantity
	public void test5() {
		String item="cashew";
		double price=50.0;
		int quantity=-1;
		boolean isAdded=GroceryAppAddItem.addItem(item, price,quantity);
		assertFalse(isAdded);
	}
	@Test
	//Case check
	public void test6() {
		String item="MiLk";
		double price=50.0;
		int quantity=5;
		boolean isAdded=GroceryAppAddItem.addItem(item, price,quantity);
		assertFalse(isAdded);
	}
	@Test
	//Space check
	public void test7() {
		String item="milk  ";
		double price=50.0;
		int quantity=5;
		boolean isAdded=GroceryAppAddItem.addItem(item, price,quantity);
		assertFalse(isAdded);
	}

}
