package grocery_Management;

public class GroceryAppGst {
public static double priceWithGst(double price) {
	double gst=7.0;
	double priceWithGst=((gst*price)/100)+price;
	System.out.println(priceWithGst);
	return priceWithGst;
}
}
