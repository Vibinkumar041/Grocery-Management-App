package grocery_Management;

import static org.junit.Assert.*;

import org.junit.Test;

public class OfferTest {

	@Test
	//If it is a new user
	public void test1() {
		double priceWithGst=107.0;
		boolean isAddedNewUser=true;
		double price=GroceryAppNewUserOffer.offer(priceWithGst, isAddedNewUser);
		assertEquals(90.95,price,0);
	}
	@Test
	//If it is a existing user
	public void test2() {
		double priceWithGst=107.0;
		boolean isAddedNewUser=false;
		double price=GroceryAppNewUserOffer.offer(priceWithGst, isAddedNewUser);
		assertEquals(107.0,price,0);
	}

}
