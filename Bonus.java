import java.util.Scanner;

/**
 * 
 */

/**
 * @author Avneesh C
 *
 */
public class Bonus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myinput = new Scanner(System.in);
		
		int sales;
		double salary;
		double bonus;
		int yearWorked;
		
		System.out.print("Enter sales amount: $");
		sales = myinput.nextInt();
		
		System.out.print("Enter how many years does the employee has worked in the company: ");
		yearWorked = myinput.nextInt();
		
		/**
		 * calculate salary
		 */
		salary = sales * 0.15;
		
		if(yearWorked>=3) {
			bonus = salary * 0.1;
			salary = salary + bonus;
			System.out.print("Employee's Salary: $"+salary);
			
		}
		if(yearWorked < 3) {
			System.out.print("Employee's Salary: $"+salary);
			
		}
		
		
	}

}
