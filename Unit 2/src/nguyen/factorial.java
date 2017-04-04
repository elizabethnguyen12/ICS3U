package nguyen;
import java.util.Scanner;
/**
 * factorial.java
 * returns the factorial of the inputted number
 * April 3rd, 2017
 * @author Elizabeth Nguyen
 */
public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number and you'll get a factorial of it.");
		int num = sc.nextInt();
		System.out.println("The factorial is " + factorial(num) + ".");
		
	}
	
	/**
	 * obtains the number inputted by the user and gets the factorial of it
	 * @param int a is the input number
	 * @return the factorial of the given number
	 */
	public static int factorial(int a) {
		if (a < 0) {
			return -1;
		}
		else if (a == 0) {
			return 1;
		}
		else {
			int product = a;
			while (a > 1) {
				product = product * (a - 1);
				a--;
			}
			return product;
		}
	}

}
