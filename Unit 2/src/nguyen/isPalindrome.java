package nguyen;

import java.util.Scanner;

/** isPalindrome.java
 * Sees if the word inputted by the user is a palindrome
 * @author Elizabeth Nguyen
 * April 16th, 2017
 */

public class isPalindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String palin;

			System.out.println("Enter a word to see if it's palindrome or not.");

			palin =  scan.nextLine();

			System.out.println(isPalindrome(palin));

	}

	/**
	 * Sees if word's a palindrome or not
	 * @param x is a string that is compared to the palindrome
	 * @return true/false
	 */
	public static boolean isPalindrome(String a) {

		int length = a.length()-1;

		for (int i = 0; i < a.length()-1; i++) { 

			if (a.charAt(i) != a.charAt(length))
				return false;

			length--;
		}
		return true;
	}
}
