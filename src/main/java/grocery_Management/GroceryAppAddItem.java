package grocery_Management;

import java.util.HashMap;

public class GroceryAppAddItem {
	static HashMap<String, Double> grocery_Price = new HashMap<String, Double>();
	static {
		grocery_Price.put("milk", 15.0);
		grocery_Price.put("bread", 20.0);
		grocery_Price.put("wheat", 25.0);
	}
	static HashMap<String, Integer> grocery_Quantity = new HashMap<String, Integer>();
	static {
		grocery_Quantity.put("milk", 40);
		grocery_Quantity.put("bread", 40);
		grocery_Quantity.put("wheat", 40);
	}

	/**
	 * This method is used to add new Item to an inventory by getting the name price
	 * per quantity and quantity as a input.
	 * 
	 * @param item
	 * @param quantity
	 * @return
	 */
	public static boolean addItem(String item, double price, int quantity) {
		String caseName = item.toLowerCase();
		String trimName = caseName.trim();
		boolean isValidName = Validation.checkString(trimName);//To check null or not
		boolean isValidPrice = Validation.checkPrice(price);//To check !<=0
		boolean isValidQuantity = Validation.checkNumber(quantity);//To check !<=0
		boolean isAdded = false;
		if (isValidName && isValidPrice && isValidQuantity) {
			if (grocery_Price.containsKey(trimName)) {//To check exist item or not
				System.out.println("Item already exist");
				isAdded = false;
			} else {
				System.out.println("before");
				System.out.println("Grocery with price=" + grocery_Price);
				System.out.println("Grocery with quantity=" + grocery_Quantity);
				//Enter the new item to the list
				grocery_Price.put(trimName, price);
				grocery_Quantity.put(trimName, quantity);
				System.out.println("After");
				System.out.println("Grocery with pric=" + grocery_Price);
				System.out.println("Grocery with quantity=" + grocery_Quantity);
				isAdded = true;
			}
		}else {
			System.out.println("Invalid inputs");
			isAdded=false;
		}
		return isAdded;
	}
}
