package grocery_Management;

import java.util.HashMap;

public class GroceryAppAddQuantity {
	static HashMap<String, Integer> grocery_Quantity = new HashMap<String, Integer>();
	static {
		grocery_Quantity.put("milk", 40);
		grocery_Quantity.put("bread", 40);
		grocery_Quantity.put("biscuit", 40);
	}

	/**
	 * This method is used to add the quantity to the existing item present in the
	 * inventory.
	 * 
	 * @param item
	 * @param quantity
	 * @return
	 */
	public static boolean addQuantity(String item, int quantity) {
		String caseName = item.toLowerCase();
		String trimName = caseName.trim();
		boolean isQuantityAdded = false;
		boolean isValidName = Validation.checkString(trimName);//To check the name
		boolean isValidQuantity = Validation.checkNumber(quantity);//To check the quantity
		if (isValidName && isValidQuantity) {
			if (grocery_Quantity.containsKey(trimName)) {//To check the item exist or not
				int actualQuantity = grocery_Quantity.get(trimName);
				int afterQuantity = actualQuantity + quantity;
				System.out.println("Before");
				System.out.println("Grocery with quantity=" + grocery_Quantity);
				grocery_Quantity.put(trimName, afterQuantity);//update the quantity
				System.out.println("Quantity successfully updated");
				System.out.println("After");
				System.out.println("Grocery with quantity=" + grocery_Quantity);
				isQuantityAdded = true;
			} else {
				System.out.println("Item not exist");
				isQuantityAdded = false;
			}
		}else {
			System.out.println("Invalid inputs");
			isQuantityAdded=false;
		}
		return isQuantityAdded;
	}
}
