import java.util.Scanner;

/**
 * 
 */

/**
 * @author Avneesh C
 *
 */
public class average_of_4_numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1;
		double num2;
		double num3;
		double num4;
		double sum;
		double average;
		
		Scanner myinput = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		num1 = myinput.nextDouble();
		
		System.out.print("Enter second number: ");
		num2 = myinput.nextDouble();
		
		System.out.print("Enter third number: ");
		num3 = myinput.nextDouble();
		
		System.out.print("Enter fourth number: ");
		num4 = myinput.nextDouble();
		
		sum = num1 + num2 + num3 + num4;
		
		average = sum/4;
		System.out.print("The sum of the four numbers is " +sum+" and the average is "+average);
		
	}

}
