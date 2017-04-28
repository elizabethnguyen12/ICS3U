package nguyen;
/** Life.java
 * A user will type in where they want to put the live cells and it will either kill cells or make them survive.
 * @author Elizabeth Nguyen
 * April 28th, 2017
 */

import java.util.Scanner;

public class Life {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[][] arr = new char [20][20];
		for(int i = 0; i <= 19; i++){
			for(int j = 0; j <= 19; j++){
				arr[i][j] = 'O';
			}
		}

		System.out.println("How many live cells would you like to enter?");
		int cell = sc.nextInt();
		int x = 0; //initial row
		int y = 0; //initial column
		System.out.println("Enter a coordinate of one cell each time from 0-19, with x as the first number and y as the second number. Include a space between them.");	
		for(int b = 0; b < cell; b++){
			x = sc.nextInt(); 
			y = sc.nextInt();
			while (x >= 20 || y >= 20) {
				System.out.println("Please enter the coordinates from 0-19 for x and y (X Y).");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			arr[x][y] = 'X';
		}

		int generation = 0;
		System.out.print("Day: " + generation);
		for(int i = 0; i <= 19; i++){
			System.out.println();
			for(int l = 0; l <= 19; l++){
				System.out.print(arr[i][l]);
			}
		}

		boolean again = true;
		while(again != false){
			char[][] hold = new char [20][20];
			for(int i = 0; i <= 19; i++){
				for(int l = 0; l <= 19; l++){
					hold[i][l] = 'O';
				}
			}
			
			for(int m = 0; m <= 19; m++){
				for(int n = 0; n <= 19; n++){
					if(arr[m][n] == 'X'){
						if(survive(arr, m, n) == true){
							hold[m][n] = 'X';
						}
						else{
							hold[m][n] = 'O';
						}
					}
					else{
						if(survive(arr, m, n) == true){
							hold[m][n] = 'X';
						}
						else{
							hold[m][n] = 'O';
						}
					}
				}
			}
			arr = hold;
			generation++;

			System.out.println();

			for(int i = 0; i <= 19; i++){
				if(i == 0){
					System.out.println("Day: " + generation);
				}
				else{
					System.out.println();
				}
				for(int l = 0; l < 20; l++){
					System.out.print(arr[i][l]);
				}
			}
			if(death(arr) != false){
				System.out.println();
				System.out.println("You have died.");
				again = false;
			}
			else{
				System.out.println();
				System.out.println("Play again? (y/n)");
				String yes = sc.nextLine();
				if (yes.equals("y")){
					if(yes.equals("y")){
						again = true;
					}
					else if(yes.equals("n") || yes.equals("n")){
						again = false;
					}
				}
				else{
					String input = sc.nextLine();
					if(input.equals("y")){
						again = true;
					}
					else
					{
						again = false;
					}
				}
			}
		}
		sc.close();
	}
	
	/**
	 * Sees if all places are zeros, if there are no X's then the game ends
	 * @param check is a char to see if the place equals X, if it is X then the game didn't end
	 * @return true or false
	 */
	public static boolean death (char[][] death){
		for(int c = 0; c <= 19; c++){
			for(int d = 0; d <= 19; d++){
				if(death[c][d] == 'X'){
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Checks the surrounding neighbours to see if the cell survives or not
	 * @param neighbour is a char for the surrounding neighbour coordinate
	 * @param h is an int representing the x coordinate
	 * @param i is an int representing the y coordinate
	 * @return true or false
	 */
	public static boolean survive (char[][] neighbour, int h, int i){
		int counter = 0;
		if(h - 1 >= 0 && i - 1 >= 0){
			if(neighbour[h-1][i-1] == ('X')){
				counter++;
			}
		}

		if(i - 1 >= 0){
			if(neighbour[h][i-1] == ('X')){
				counter++;
			}
		}
		
		if(h - 1 >= 0){
			if(neighbour[h-1][i] == ('X')){
				counter++;
			}
		}
		
		if(h + 1 <= 19 && i + 1 <= 19){	
			if(neighbour[h+1][i+1] == ('X')){
				counter++;
			}
		}

		if(i + 1 <= 19){
			if(neighbour[h][i+1] == ('X')){
				counter++;
			}
		}
		
		if(h + 1 <= 19){
			if(neighbour[h+1][i] == ('X')){
				counter++;
			}
		}
		
		if(h - 1 >= 0 && i + 1 <= 19){
			if(neighbour[h-1][i+1] == ('X')){
				counter++;
			}
		}
		
		if(h + 1 <= 19 && i - 1 >= 0){
			if(neighbour[h+1][i-1] == ('X')){
				counter++;
			}
		}
		
		if(neighbour[h][i] == ('X')){
			if(counter == 3 || counter == 2){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			if(counter == 3){
				return true;
			}
			else{
				return false;
			}
		}

	}


}
