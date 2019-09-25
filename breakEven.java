import java.util.Scanner;

/**
 * 
 */

/**
 * @author Avneesh C
 *
 */
public class breakEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myinput = new Scanner(System.in);
		
		double totalCost;
		double totalRevenue;
		double profit;
		double loss;
		
		System.out.print("Enter company's total cost: ");
		totalCost = myinput.nextDouble();
		
		System.out.print("Enter company's total revenue: ");
		totalRevenue = myinput.nextDouble();
		
		if(totalCost == totalRevenue) {
			System.out.println("Break-Even");
		}
		if((totalRevenue - totalCost)>0) {
			profit = totalRevenue - totalCost;
			System.out.print("The company has made a profit of "+profit);
		}
		if((totalRevenue - totalCost)<0) {
			loss = totalRevenue - totalCost;
			System.out.print("The company has made a profit of "+loss);
		}
		
	}

}
