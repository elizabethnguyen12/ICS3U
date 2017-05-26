package nguyen;
import java.util.Scanner;
/**
 * sentence.java
 * returns the sentence with the letters of each word written backwards
 * April 7th, 2017
 * @author Elizabeth Nguyen
 */
public class sentence {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a sentence and each word will be written backwards");
		String[] sentence = sc.nextLine().split(" ");
		for (int i=0 ; i<sentence.length; i++) {
			for (int j=sentence[i].length()-1; j>=0; j--) {
				System.out.print(sentence[i].charAt(j));
		}
System.out.print(" ");
	}
	
}
}