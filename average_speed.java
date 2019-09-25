import java.util.Scanner;

/**
 * 
 */

/**
 * @author Avneesh C
 *
 */
public class average_speed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myinput = new Scanner(System.in);
		
		double time;
		double distance;
		double averagespeed;
		
		
		System.out.print("Enter time: ");
		time = myinput.nextDouble();
		
		System.out.print("Enter distance: ");
		distance = myinput.nextDouble();
		
		averagespeed = distance/time;
		
		System.out.print("the average speed is "+averagespeed);
		
	}

}
