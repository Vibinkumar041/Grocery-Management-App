package grocery_Management;

public class GroceryAppNewUserOffer {
public static double offer(double priceWithGst,boolean isAddedNewUser) {
	double discount=15.0;//percentage
	double priceWithOffer = 0;
	if(isAddedNewUser==true) {
		priceWithOffer=priceWithGst-(discount/100*priceWithGst);
		System.out.println(priceWithOffer);
	}
	if(isAddedNewUser==false) {
		priceWithOffer=priceWithGst;
	}
	return priceWithOffer;
}
}