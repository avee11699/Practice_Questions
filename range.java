import java.util.Scanner;

/**
 * 
 */

/**
 * @author Avneesh C
 *
 */
public class range {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myinput = new Scanner(System.in);
		
		int num;
		
		System.out.print("Enter number between 1 and 50: ");
		num = myinput.nextInt();
		
		if(num >=1 && num <=50){
			System.out.println("number is in range of 1 to 50");
		}
		else {
			System.out.println("Error! number is not in the range of 1 to 50.");
		}
	}

}
