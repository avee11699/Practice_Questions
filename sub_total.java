import java.util.Scanner;

/**
 * 
 */

/**
 * @author Avneesh C
 *
 */
public class sub_total {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myinput = new Scanner(System.in);
		
		String item1;
		String item2;
		int cost;
		int qty;
		double vat;
		double totalPrice;
		double subTotal;
		
		for(int i=1; i <= 2; i++) {
			System.out.println("*******************************************");
			System.out.print("Enter item name: ");
			item1 = myinput.next();
		
			System.out.print("Enter cost of each item: ");
			cost = myinput.nextInt();
		
			System.out.print("Enter Quantity: ");
			qty = myinput.nextInt();
			
			vat = (cost * 0.15)*qty;
			totalPrice = ((cost*qty)+ vat);
			System.out.println("Total cost of first item (include VAT): "+totalPrice);

			System.out.println("*******************************************");
		}
		
		subTotal = totalPrice + totalPrice;
		
	}

}
