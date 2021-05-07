package grocery_Management;

import static org.junit.Assert.*;

import org.junit.Test;

public class PriceEstimationTest {

	@Test
	//known item
	public void test1() {
		String item="milk";
		int quantity=20;
		double price=GroceryAppPriceEstimation.purchase(item, quantity);
		assertEquals(300.0,price,0);
	}
	@Test
	//ordered quantity is grater than the available quantity.
	public void test2() {
		String item="tea";
		int quantity=50;
		double price=GroceryAppPriceEstimation.purchase(item, quantity);
		assertEquals(0.0,price,0);
	}
	@Test
	//unknown item
	public void test3() {
		String item="biscuit";
		int quantity=2;
		double price=GroceryAppPriceEstimation.purchase(item, quantity);
		assertEquals(0.0,price,0);
	}
	@Test
	//Negative quantity
	public void test4() {
		String item="bread";
		int quantity=-2;
		double price=GroceryAppPriceEstimation.purchase(item, quantity);
		assertEquals(0.0,price,0);
	}
	@Test
	//case Check
	public void test5() {
		String item="Tea";
		int quantity=2;
		double price=GroceryAppPriceEstimation.purchase(item, quantity);
		assertEquals(60.0,price,0);
	}
	@Test
	//spae Check
	public void test7() {
		String item="   tEa    ";
		int quantity=2;
		double price=GroceryAppPriceEstimation.purchase(item, quantity);
		assertEquals(60.0,price,0);
	}

}
