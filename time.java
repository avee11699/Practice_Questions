import java.util.Scanner;

/**
 * 
 */

/**
 * @author Avneesh C
 *
 */
public class time {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myinput = new Scanner(System.in);
		double second;
		double minute;
		
		System.out.print("Enter number of second: ");
		second = myinput.nextDouble();
		
		minute = second/60;
		System.out.print(second+" seconds represent "+minute+" minutes.");
	
	}

}
