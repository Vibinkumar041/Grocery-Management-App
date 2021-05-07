package grocery_Management;

import java.util.HashMap;

public class GroceryAppDisplay {
	static HashMap<String, Integer> grocery_Price = new HashMap<String, Integer>();
	static {
		grocery_Price.put("milk", 15);
		grocery_Price.put("bread", 20);
		grocery_Price.put("wheat", 25);
	}
	static HashMap<String, Integer> grocery_Quantity = new HashMap<String, Integer>();
	static {
		grocery_Quantity.put("milk", 40);
		grocery_Quantity.put("bread", 40);
		grocery_Quantity.put("wheat", 40);
	}

	/**
	 * This method is used to display the items present in the inventory. (i)
	 * name-price (ii) name-quantity
	 */
	public static void display() {
		System.out.println("Available items with Price/Quantity=" + grocery_Price);
		System.out.println("Available items with Quantity=" + grocery_Quantity);
	}
}