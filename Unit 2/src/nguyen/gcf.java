package nguyen;
import java.util.Scanner;
/**
 * gcf.java
 * returns the greatest common factor entered
 * April 3rd, 2017
 * @author Elizabeth Nguyen
 */
public class gcf {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int x, y;
		
		System.out.println("Find the greatest common factor of two numbers. Enter your first number.");
		x = getInt();
		
		System.out.println("Enter another number.");
		y = getInt();
		
		System.out.println("The greatest common factor is " + gcf(x, y));
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
	 * finds the biggest and smallest number first, then divides both numbers by the smallest number. If neither equal 0, the divisor is decreased by one and the process repeats.
	 * @param int a, int b are input numbers
	 * @return the greatest common factor of the given numbers
	 */
	public static int gcf(int a, int b) {
		int big = Math.max(a, b);
		int small = Math.min(a, b);
		int counter = small;
		while(isDivisible(big,counter) == false || isDivisible(small,counter) == false) {
			counter--;
		}
		return counter;
	}

	/**
	 * sees if two numbers are divisible with no remainder. If there's no remainder then it'll return true
	 * @param int a, int b are input numbers
	 * @return true or false
	 */
public static boolean isDivisible(int a, int b) {
	if (a%b == 0) {
		return true;
	}
	return false;
}
}
