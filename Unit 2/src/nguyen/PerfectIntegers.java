package nguyen;

import java.util.Scanner;

public class PerfectIntegers {

	/**
	 * PerfectIntegers.java
	 * Prints numbers that are perfect integers less than 100
	 * April 21, 2017
	 * @author Elizabeth Nguyen
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		for (int i=1; i<100; i++)
		if (perfectInt(i) == true){
			System.out.println(i);
		}
		


	}
	
	/**
	 * Sees if number is a perfect integer
	 * @param a is the input number
	 * @return true/false, true if a perfect integer and false otherwise
	 */
	public static boolean perfectInt(int a) {
		int num = 0;
		for (int i = a-1; i > 0; i--){
			if(a%i == 0){
				num = num + i;
			}
		}
		
		if(num != a){
			return false;
		}
		else{
			return true;
		}
	}
}

