package grocery_Management;

import java.util.HashMap;

public class GroceryAppAddNewUser {
	static HashMap<Long, String> userDetails = new HashMap<Long, String>();
	static {
		userDetails.put(9578786367L, "Siva#123");
		userDetails.put(9578786366L, "linGam&564");
	}

	/**
	 * This method is used to add the new user to the userDetails list, by getting
	 * their mobile number and password as a input.
	 * 
	 * @param mobileNumber
	 * @param password
	 * @return
	 */
	public static boolean AddUser(long mobileNumber, String password) {

		boolean isValidMobileNumber = Validation.checkMobileNumber(mobileNumber);//To cehck the format
		boolean isValidPassword = Validation.checkPassword(password);//To cehck the format
		boolean isAddedNewUser = false;
		if (isValidMobileNumber && isValidPassword) {
			if (userDetails.containsKey(mobileNumber)) {//To check exist or not
				System.out.println("Mobile Number already exist");
				isAddedNewUser = false;
			} else {
				userDetails.put(mobileNumber, password);//register the new user
				System.out.println("Successfully registered");
				isAddedNewUser = true;
			}
		} else {
			System.out.println("Invalid credentials");
			isAddedNewUser = false;
		}
		return isAddedNewUser;
	}
}