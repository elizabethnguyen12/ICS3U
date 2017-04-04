package nguyen;
import java.util.Scanner;
/**
 * largestNumber.java
 * returns the largest number out of the array
 * April 3rd, 2017
 * @author Elizabeth Nguyen
 */
public class largestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of numbers you wish to enter.");
		int n = sc.nextInt();
		int[] numbers = new int[n];
		System.out.println("Enter one number each time.");
		for (int i = 0; i<n; i++)
			numbers[i] = sc.nextInt();

		System.out.println("The largest number is " + large(numbers) + ".");
		
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