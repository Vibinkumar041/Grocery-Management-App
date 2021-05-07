package grocery_Management;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	/**
	 * To check the string is not null or space
	 * 
	 * @param name
	 * @return
	 */
	public static boolean checkString(String name) {
		boolean isValid = false;
		if (name == null || name.trim().equals("")) {
			isValid = false;
		} else {
			isValid = true;
		}
		return isValid;
	}

	/**
	 * To check the number is not <=0
	 * 
	 * @param number
	 * @return
	 */
	public static boolean checkNumber(int number) {
		boolean isValid = false;
		if (number <= 0) {
			isValid = false;
		} else {
			isValid = true;
		}
		return isValid;
	}

	/**
	 * It is used to check the mobile number.
	 * 
	 * @param mobileNumber
	 * @return
	 */
	public static boolean checkMobileNumber(long mobileNumber) {
		boolean isValidPattern;
		String mobileNumberString = Long.toString(mobileNumber);
		Pattern p = Pattern.compile("(0/91)?[6-9][0-9]{9}");
		Matcher m = p.matcher(mobileNumberString);
		isValidPattern = (m.find() && m.group().equals(mobileNumberString));
		return isValidPattern;
	}

	/**
	 * It is used to check the password.
	 * 
	 * @param password
	 * @return
	 */
	public static boolean checkPassword(String password) {
		boolean isValid = false;
		if (password == null) {
			return isValid;
		}
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		isValid = m.matches();
		return isValid;
	}
	public static boolean checkPrice(double price) {
		boolean isValid = false;
		if (price <= 0.0) {
			isValid = false;
		} else {
			isValid = true;
		}
		return isValid;
	}
}
