package grocery_Management;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExistingUserTest {

	@Test
	//known user
	public void test1() {
		long MobileNumber=9578786367L;
		String password="Siva#123";
		boolean isExistingUser=GroceryAppCheckExistingUser.checkExistingUser(MobileNumber, password);
		assertTrue(isExistingUser);
	}
	@Test
	//known user with different password
	public void test2() {
		long MobileNumber=9578786367L;
		String password="linGam&564";
		boolean isExistingUser=GroceryAppCheckExistingUser.checkExistingUser(MobileNumber, password);
		assertFalse(isExistingUser);
	}
	@Test
	//mobileNumber !=10
	public void test3() {
		long MobileNumber=9578L;
		String password="siva#112";
		boolean isExistingUser=GroceryAppCheckExistingUser.checkExistingUser(MobileNumber, password);
		assertFalse(isExistingUser);
	}
	@Test
	//password !>=8
	public void test4() {
		long MobileNumber=9578786367L;
		String password="siva#1";
		boolean isExistingUser=GroceryAppCheckExistingUser.checkExistingUser(MobileNumber, password);
		assertFalse(isExistingUser);
	}
	

}
