package grocery_Management;

import static org.junit.Assert.*;

import org.junit.Test;

public class GstTest {

	@Test
	public void test() {
		double price=100.0;
		double priceGst=GroceryAppGst.priceWithGst(price);
		assertEquals(107.0,priceGst,0);
	}

}
