package grocery_Management;

import java.util.HashMap;

public class GroceryAppUpdatePrice {
	static HashMap<String, Double> grocery_Price = new HashMap<String, Double>();
	static {
		grocery_Price.put("milk", 15.0);
		grocery_Price.put("bread", 20.0);
		grocery_Price.put("wheat", 25.0);
	}

	/**
	 * This method is used to update the price of the existing item present in the
	 * inventory.
	 * 
	 * @param item
	 * @param quantity
	 * @return
	 */
	public static boolean updatePrice(String item, double price) {
		String caseName = item.toLowerCase();
		String trimName = caseName.trim();
		boolean isUpdated = false;
		boolean isValidName = Validation.checkString(trimName);//name format
		boolean isValidPrice = Validation.checkPrice(price);//number format
		if (isValidName && isValidPrice) {
			if (grocery_Price.containsKey(trimName)) {//check the item available or not
				System.out.println("Before");
				System.out.println("Grocery with price=" + grocery_Price);
				grocery_Price.put(trimName, price);//update the price
				System.out.println("Price successfully updated");
				System.out.println("After");
				System.out.println("Grocery with price=" + grocery_Price);
				isUpdated = true;
			} else {
				System.out.println("Item not exist");
				isUpdated = false;
			}
		}else {
			System.out.println("Invalid inputs");
		}
		return isUpdated;
	}
}
