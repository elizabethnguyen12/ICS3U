package nguyen;
import java.util.Scanner;
/**
 * largestNumber.java
 * returns the largest number out of the array
 * April 3rd, 2017
 * @author Elizabeth Nguyen
 */
public class largestNumber {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Find the largest number amongst the numbers you enter. First enter the amount of numbers you wish to have.");
		int n = getInt();
		int[] numbers = new int[n];
		System.out.println("Enter one number each time.");
		for (int i = 0; i<n; i++)
			numbers[i] = getInt();

		System.out.println("The largest number is " + large(numbers) + ".");
		
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
	 * 
	 * @param int[]array is an array for input
	 * @return the largest number
	 */
	public static int large(int[]array) {
		int largestNumber = array[0];
		for (int i=1;i<array.length;i++) {
			if (array[i]>largestNumber){
				largestNumber = array[i];
			}
		}
return largestNumber;
}
}