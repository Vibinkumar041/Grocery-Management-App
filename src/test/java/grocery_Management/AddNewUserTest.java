package grocery_Management;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddNewUserTest {

	@Test
	//new user
	public void test1() {
		long mobileNumber=9524977676L;
		String password="Mithun&1t2";
		boolean isAddedNewUser=GroceryAppAddNewUser.AddUser(mobileNumber, password);
		assertTrue(isAddedNewUser);
	}
	
	@Test
	//existing user
	public void test2() {
		long mobileNumber=9578786367L;
		String password="Vibin%2183";
		boolean isAddedNewUser=GroceryAppAddNewUser.AddUser(mobileNumber, password);
		assertFalse(isAddedNewUser);
	}
	@Test
	//without password
	public void test3() {
		long mobileNumber=9578786369L;
		String password="";
		boolean isAddedNewUser=GroceryAppAddNewUser.AddUser(mobileNumber, password);
		assertFalse(isAddedNewUser);
	}
	@Test
	//without mobilenumber
	public void test4() {
		long mobileNumber = 0;
		String password="kumaR$125";
		boolean isAddedNewUser=GroceryAppAddNewUser.AddUser(mobileNumber, password);
		assertFalse(isAddedNewUser);
	}
	@Test
	//Negative mobilenumber
	public void test5() {
		long mobileNumber =-9524977676L;
		String password="kumaR$125";
		boolean isAddedNewUser=GroceryAppAddNewUser.AddUser(mobileNumber, password);
		assertFalse(isAddedNewUser);
	}
	@Test
	//mobilenumber start with 1-5
	public void test6() {
		long mobileNumber =5524977676L;
		String password="kumaR$125";
		boolean isAddedNewUser=GroceryAppAddNewUser.AddUser(mobileNumber, password);
		assertFalse(isAddedNewUser);
	}

}
