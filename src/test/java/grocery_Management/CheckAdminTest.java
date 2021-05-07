package grocery_Management;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckAdminTest {

	@Test
	// valid admin
	public void test1() {
		long mobileNumber = -9659644868L;
		String password = "Vibin$432";
		boolean isAdmin = GroceryAppCheckAdmin.admin(mobileNumber, password);
		assertTrue(isAdmin);
	}

	@Test
	// known admin with different password
	public void test2() {
		long mobileNumber = 9659679989L;
		String password = "Kumar%%443";
		boolean isAdmin = GroceryAppCheckAdmin.admin(mobileNumber, password);
		assertFalse(isAdmin);
	}

	@Test
	// Invalid password pattern
	public void test3() {
		long mobileNumber = 9578786367L;
		String password = "sankar";
		boolean isAdmin = GroceryAppCheckAdmin.admin(mobileNumber, password);
		assertFalse(isAdmin);
	}

	@Test
	// mobilenumber!=10
	public void test4() {
		long mobileNumber = 965964L;
		String password = "vibin";
		boolean isAdmin = GroceryAppCheckAdmin.admin(mobileNumber, password);
		assertFalse(isAdmin);
	}

	// password !>=8
	@Test
	public void test5() {
		long mobileNumber = 9659644868L;
		String password = "vBin@4";
		boolean isAdmin = GroceryAppCheckAdmin.admin(mobileNumber, password);
		assertFalse(isAdmin);
	}

}
