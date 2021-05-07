package grocery_Management;

import java.util.HashMap;

public class GroceryAppCheckExistingUser {
	static HashMap<Long, String> userDetails = new HashMap<Long, String>();
	static {
		userDetails.put(9578786367L, "Siva#123");
		userDetails.put(9578786366L, "linGam&564");
	}

	/**
	 * To Check whether the user is an existing one or not, by checking their
	 * mobilenumber and password as a input.
	 * 
	 * @param mobileNumber
	 * @param password
	 * @return
	 */
	public static boolean checkExistingUser(long mobileNumber, String password) {
		boolean isValidMobileNumber = Validation.checkMobileNumber(mobileNumber);//To check the mobilenumber format
		boolean isValidPassword = Validation.checkPassword(password);//To check the password format
		boolean isExistingUser = false;
		if (isValidMobileNumber && isValidPassword) {
			//Check the data with previously stored data.
			boolean isMobileNumberExist = userDetails.containsKey(mobileNumber);
			if (isMobileNumberExist) {
				boolean isPasswordExist = userDetails.get(mobileNumber).equals(password);
				if (isPasswordExist) {
					System.out.println("Valid user");
					isExistingUser = true;
				} else {
					System.out.println("Invalid User");
					isExistingUser = false;
				}
			} else {
				System.out.println("Invalid User");
				isExistingUser = false;
			}
		} else {
			System.out.println("Invalid inputs");
			isExistingUser = false;
		}
		return isExistingUser;
	}
}
