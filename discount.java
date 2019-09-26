import java.util.Scanner;

/**
 * 
 */

/**
 * @author Avneesh C
 *
 */
public class discount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myinput = new Scanner(System.in);
		
		int sales;
		double discount;
		double netsales;
		
		System.out.print("Enter total sales: Rs");
		sales = myinput.nextInt();
		
		if(sales > 10000) {
			discount = sales * 0.1;
			netsales = sales + discount;
			System.out.print("Total sales: Rs"+netsales);
		}
		else {
			System.out.print("Total sales: Rs");
		}
	}

}
