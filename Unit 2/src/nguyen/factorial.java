package nguyen;
import java.util.Scanner;
/**
 * factorial.java
 * returns the factorial of the inputted number
 * April 3rd, 2017
 * @author Elizabeth Nguyen
 */
public class factorial {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number and you'll get a factorial of it.");
		int num = getInt();
		System.out.println("The factorial is " + factorial(num) + ".");
		
	}
	
	/**
	 * tells the user they entered something besides an int and tells them to enter again
	 * @param "" is the input
	 * @return statement saying to enter a valid number
	 */
	
	public static int getInt(){	
		do {
			try {
				return Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Please enter a valid number with no decimals.");
			}
		} while (true);
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
