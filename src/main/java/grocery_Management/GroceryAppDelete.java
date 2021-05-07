package grocery_Management;

import java.util.HashMap;

public class GroceryAppDelete {
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
	 * This method is used to delete the existing item present in the inventory by
	 * getting the name as a input.
	 * 
	 * @param item
	 * @return
	 */
	public static boolean deleteItem(String item) {
		String caseName = item.toLowerCase();
		String trimName = caseName.trim();
		boolean isDeleted = false;
		boolean isValidName = Validation.checkString(trimName);//To check the name valid or not
		if (isValidName) {
			boolean isAvailable=grocery_Price.containsKey(trimName);
			if(isAvailable) {
			System.out.println("before");
			System.out.println("Grocery with pric=" + grocery_Price);
			System.out.println("Grocery with quantity=" + grocery_Quantity);
			//Delete the item from the inventory
			grocery_Price.remove(trimName);
			grocery_Quantity.remove(trimName);
			System.out.println("Successfully deleted");
			System.out.println("After");
			System.out.println("Grocery with pric=" + grocery_Price);
			System.out.println("Grocery with quantity=" + grocery_Quantity);
			isDeleted = true;
			}else {
				System.out.println("Item not exist");
				isDeleted=true;
			}
		} else {
			System.out.println("Invalid name");
			isDeleted = false;
		}
		return isDeleted;
	}
}
