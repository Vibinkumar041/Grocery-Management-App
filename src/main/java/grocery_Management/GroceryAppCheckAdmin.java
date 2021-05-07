package grocery_Management;

import java.util.ArrayList;

class Admin {
	public long mobileNumber;
	public String password;
}

public class GroceryAppCheckAdmin {
	static ArrayList<Admin> adminList = new ArrayList<Admin>();
	static {
		Admin admin1 = new Admin();
		admin1.mobileNumber = 9659644868L;
		admin1.password = "Vibin$432";

		Admin admin2 = new Admin();
		admin2.mobileNumber = 9659679989L;
		admin2.password = "kUmar%%443";
		adminList.add(admin1);
		adminList.add(admin2);
	}

	/**
	 * This admin method is used to check the admin's login by getting their
	 * mobilenumber and password as a input.
	 * 
	 * @param mobileNumber
	 * @param password
	 * @return
	 */
	public static boolean admin(long mobileNumber, String password) {
		boolean isValidMobileNumber = Validation.checkMobileNumber(mobileNumber);//To check the mobilenumber format
		boolean isValidPassword = Validation.checkPassword(password);//To check the password format
		boolean isAdmin = false;
		if (isValidMobileNumber && isValidPassword) {
				for (Admin admin : adminList) {
					if (admin.mobileNumber == mobileNumber && admin.password.equals(password)) {
						System.out.println("Valid Admin");
						isAdmin = true;
						break;
					} else {
						System.out.println("Invalid Admin");
						isAdmin = false;
						break;
					}
				}
			} else {
				System.out.println("Invalid inputs");
				isAdmin = false;
			}
		return isAdmin;
	}
}
