import java.util.Scanner;

/**
 * 
 */

/**
 * @author Avneesh C
 *
 */
public class cost_dvd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myinput = new Scanner(System.in);
		
		int total;
		int cost;
		int dvd;
		
		System.out.print("Enter number of DVD ordered: ");
		dvd = myinput.nextInt();
		
		if(dvd < 100) {
			cost = dvd * 8;
			System.out.print("Total cost of DVDs: Rs"+cost);
		}
		if(dvd >= 100) {
			cost = dvd * 6;
			System.out.print("Total cost of DVDs: Rs"+cost);
		}
		
	}

}
