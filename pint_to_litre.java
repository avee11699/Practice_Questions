import java.util.Scanner;

/**
 * 
 */

/**
 * @author Avneesh C
 *
 */
public class pint_to_litre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myinput = new Scanner(System.in);
		
		double pint;
		double litre;
		
		System.out.print("Enter number of pints: ");
		pint = myinput.nextDouble();
		
		litre = pint/2.2;
		System.out.print(pint+" pints represents "+litre+" litres.");
		
	}

}
