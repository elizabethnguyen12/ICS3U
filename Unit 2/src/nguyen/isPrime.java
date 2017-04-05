package nguyen;
import java.util.Scanner;
/**
 * isPrime.java
 * returns true if the inputted number is a prime, false otherwise
 * April 4th, 2017
 * @author Elizabeth Nguyen
 */
public class isPrime {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number and see if it's a prime number or not.");
		int x = getInt();
		if (x <= 0 || x == 1){
			System.out.println("false");
		}
		else {
		System.out.println(primeNum(x));
		}

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
	 * sees if two numbers are divisible with no remainder. If there's no remainder then it'll return false
	 * @param int x is the input number
	 * @return true or false
	 */
	public static boolean primeNum(int x) {
		for (int i=2; i<x; i++) {
		if(isDivisible(x, i)== true) {
			return false;
		}
		}
		return true;
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