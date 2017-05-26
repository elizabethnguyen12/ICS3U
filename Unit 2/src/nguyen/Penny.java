package nguyen;

import java.util.Scanner;

public class Penny {

	/**
	 * Penny.java
	 * Penny Pitch game simulation
	 * May 8th, 2017
	 * @author Elizabeth Nguyen
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] arr = new String [5][5]; 

		for(int i = 0; i <= 4; i++){ 
			for(int j = 0; j <= 4; j++){ 
				System.out.print(arr[i][j] = "O");
			} 
System.out.println();

		} 
		
		for(int b = 0; b < 3; b++){
		int col = (int) (Math.random() * 3) + 0;
		int row = (int) (Math.random() * 3) + 0;
		System.out.print(arr[row][col] = "PUZZLE");
	}
		
		for(int b = 0; b < 3; b++){
			int col = (int) (Math.random() * 3) + 0;
			int row = (int) (Math.random() * 3) + 0;
			System.out.print(arr[row][col] = "BALL");
		}
		
		for(int b = 0; b < 3; b++){
			int col = (int) (Math.random() * 3) + 0;
			int row = (int) (Math.random() * 3) + 0;
			System.out.print(arr[row][col] = "DOLL");
		}
		
		for(int b = 0; b < 3; b++){
			int col = (int) (Math.random() * 3) + 0;
			int row = (int) (Math.random() * 3) + 0;
			System.out.print(arr[row][col] = "GAME");
		}
		
		for(int b = 0; b < 3; b++){
			int col = (int) (Math.random() * 3) + 0;
			int row = (int) (Math.random() * 3) + 0;
			System.out.print(arr[row][col] = "POSTER");
		}
	}
}
