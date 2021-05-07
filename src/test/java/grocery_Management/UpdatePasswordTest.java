package grocery_Management;

import static org.junit.Assert.*;

import org.junit.Test;

public class UpdatePasswordTest {

	@Test
	//known mobilenumber
	public void test1() {
		long mobileNumber=9578786367L;
		String oldPassword="Siva#123";
		String newPassword="sIva@193";
	boolean isUpdated=GroceryAppUpdatePassword.updatePassword(mobileNumber, oldPassword, newPassword);
	assertTrue(isUpdated);
	}
	@Test
	//unknown mobilenumber
	public void test2() {
		long mobileNumber=9578786369L;
		String oldPassword="sivA%0980";
		String newPassword="sIva@123";
	boolean isUpdated=GroceryAppUpdatePassword.updatePassword(mobileNumber, oldPassword, newPassword);
	assertFalse(isUpdated);
	}
	@Test
	//known mobilenumber with different old password
	public void test3() {
		long mobileNumber=9578786367L;
		String oldPassword="siVa$4544";
		String newPassword="Siva@123";
	boolean isUpdated=GroceryAppUpdatePassword.updatePassword(mobileNumber, oldPassword, newPassword);
	assertFalse(isUpdated);
	}
	@Test
	//known mobilenumber without new password
	public void test4() {
		long mobileNumber=9578786367L;
		String oldPassword="Siva#123";
		String newPassword="";
	boolean isUpdated=GroceryAppUpdatePassword.updatePassword(mobileNumber, oldPassword, newPassword);
	assertFalse(isUpdated);
}
}
