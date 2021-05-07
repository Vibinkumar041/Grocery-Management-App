package grocery_Management;

import static org.junit.Assert.*;

import org.junit.Test;

public class UpdatePriceTest {

	@Test
	//known item
	public void test1() {
			String item="bread";
			double price=25.0;
			boolean isUpdated=GroceryAppUpdatePrice.updatePrice(item, price);
			assertTrue(isUpdated);
	}
	@Test
	//unknown item
	public void test2() {
			String item="biscuit";
			double price=10.0;
			boolean isUpdated=GroceryAppUpdatePrice.updatePrice(item, price);
			assertFalse(isUpdated);
	}
	@Test
	//negative price
	public void test3() {
			String item="bread";
			double price=-10.0;
			boolean isUpdated=GroceryAppUpdatePrice.updatePrice(item, price);
			assertFalse(isUpdated);
	}
	@Test
	//case check
	public void test4() {
			String item="bREad";
			double price=10.0;
			boolean isUpdated=GroceryAppUpdatePrice.updatePrice(item, price);
			assertTrue(isUpdated);
	}
	@Test
	//space check
	public void test5() {
			String item="bREad    ";
			double price=10.0;
			boolean isUpdated=GroceryAppUpdatePrice.updatePrice(item, price);
			assertTrue(isUpdated);
	}
	@Test
	//without name
	public void test6() {
			String item="    ";
			double price=10.0;
			boolean isUpdated=GroceryAppUpdatePrice.updatePrice(item, price);
			assertFalse(isUpdated);
	}

}
