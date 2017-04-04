package nguyen;
import java.util.Scanner;
/**
 * gcf.java
 * returns the greatest common factor entered
 * April 3rd, 2017
 * @author Elizabeth Nguyen
 */
public class gcf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int x = sc.nextInt();
		System.out.println("Enter another number.");
		int y = sc.nextInt();
		System.out.println("The greatest common factor is " + gcf(x, y) + ".");
		
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
private static boolean isDivisible(int a, int b) {
	if (a%b == 0) {
		return true;
	}
	return false;
}
}
