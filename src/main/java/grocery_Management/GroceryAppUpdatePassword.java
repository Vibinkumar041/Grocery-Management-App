package grocery_Management;

import java.util.HashMap;

public class GroceryAppUpdatePassword {
	static HashMap<Long, String> userDetails = new HashMap<Long, String>();
	static {
		userDetails.put(9578786367L, "Siva#123");
		userDetails.put(9578786366L, "linGam&564");
	}

	public static boolean updatePassword(long mobileNumber, String oldPassword, String newPassword) {
		boolean isUpdated = false;
		boolean isValidMobileNumber = Validation.checkMobileNumber(mobileNumber);//mobilenumber format check
		boolean isValidOldPassword = Validation.checkPassword(oldPassword);//password format check
		boolean isValidNewPassword = Validation.checkPassword(newPassword);//password format check
		if (isValidMobileNumber && isValidOldPassword && isValidNewPassword) {
			boolean isMobNumExist = userDetails.containsKey(mobileNumber);//cehck mobilenumber exist or not
			if (isMobNumExist) {
				boolean isValidPassword = userDetails.get(mobileNumber).equals(oldPassword);//compare the password
				if (isValidPassword) {
					userDetails.put(mobileNumber, newPassword);//update the password
					System.out.println("Password successfully updated");
					isUpdated = true;
				} else {
					System.out.println("Enter the Old password correctly");
					isUpdated = false;
				}
			}else {
				System.out.println("Mobilenumber not exist");
				isUpdated = false;
			}
		}else {
			System.out.println("Invalid inputs");
			isUpdated = false;
		}
		return isUpdated;
	}
}
