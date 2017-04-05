package nguyen;
import java.util.Scanner;
/**
 * sumDigits.java
 * returns the sum of the digits
 * April 3rd, 2017
 * @author Elizabeth Nguyen
 */
public class sumDigits {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number and you'll get a sum of the digits, don't include decimals.");
		int num = getInt();
		System.out.println("The sum of digits is " + sumDigits(num) + ".");
		
	}
	
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
	 * obtains number user inputs and adds the digits together
	 * @param int x is the input number
	 * @return the sum of the digits of the input number
	 */
	public static int sumDigits(int x) {
		int total = 0;
		while (x > 0) {
			total = total + x % 10;
			x = x/10;
		}
		return total;
	}

}
