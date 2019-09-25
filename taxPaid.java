import java.util.Scanner;

/**
 * 
 */

/**
 * @author Avneesh C
 *
 */
public class taxPaid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mykeyboard = new Scanner(System.in);
		
		double tax;
		int salary;
		double netSalary;
		
		System.out.print("Enter salary: ");
		salary = mykeyboard.nextInt();
		
		if(salary <= 5000) {
			tax = salary*0.05;
			netSalary = salary - tax;
			System.out.print("Employe's net salary is "+netSalary);
		}
		if(salary > 5000) {
			tax = salary * 0.1;
			netSalary = salary - tax;
			System.out.print("Employe's net salary is "+netSalary);
		}
	}

}
