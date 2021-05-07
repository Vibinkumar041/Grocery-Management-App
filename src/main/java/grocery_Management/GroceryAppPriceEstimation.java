package grocery_Management;

import java.util.HashMap;

public class GroceryAppPriceEstimation {
	static HashMap<String, Double> grocery_Price = new HashMap<String, Double>();
	static {
		grocery_Price.put("milk", 15.0);
		grocery_Price.put("tea", 30.0);
		grocery_Price.put("bread", 35.0);
	}
	static HashMap<String, Integer> grocery_Quantity = new HashMap<String, Integer>();
	static {
		grocery_Quantity.put("milk", 40);
		grocery_Quantity.put("tea", 40);
		grocery_Quantity.put("bread", 40);
	}

	/**
	 * This method is used to order the item with quantity , by getting the item's
	 * name and required quantity as a input.
	 * 
	 * @param item
	 * @param quantity
	 * @return
	 */
	public static double purchase(String item, Integer quantity) {
		String caseName = item.toLowerCase();//Stored in lowercase
		String trimName = caseName.trim();
		double price = 0.0;
		boolean isValidName = Validation.checkString(trimName);//name validation
		boolean isValidQuantity = Validation.checkNumber(quantity);//number validation
		if (isValidName && isValidQuantity) {
			if (grocery_Price.containsKey(trimName)) {//Check item exist or not
				int actualQuantity = grocery_Quantity.get(trimName);
				if (actualQuantity >= quantity) {//ordered quantity must below the available quantity
					System.out.println("Before order");
					System.out.println("Grocery with quantity=" + grocery_Quantity);
					int afterQuantity = actualQuantity - quantity;
					grocery_Quantity.put(trimName, afterQuantity);//Update the quantity after order item
					double pricePerQuantity = grocery_Price.get(trimName);
					price = quantity * pricePerQuantity;//price estimation
					System.out.println("After order");
					System.out.println("Grocery with quantity=" + grocery_Quantity);
					System.out.println(trimName+" price per quantity is="+pricePerQuantity+" Rs");
					System.out.println("The amount for "+trimName+" ,quantity ("+quantity+") is= "+price+"Rs");
				} else {
					System.out.println("Insufficient item please enter the quantity below "+actualQuantity);
					price = 0.0;
				}
			}else {
				System.out.println("Item not available");
				price=0.0;
			}
		}else {
			System.out.println("Invalid inputs");
			price=0.0;
		}
		return price;
	}
}
