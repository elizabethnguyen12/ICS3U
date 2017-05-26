package nguyen;
/** Life.java
 * This program checks to see if it will die/revive based on the surrounding cells
 * @author ainslieforbes
 * Apr 27
 */

import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//make an 2D char array and 
		char[][] arr = new char [20][20];//puts and O in every space
		for(int i = 0; i < 20; i++){
			for(int k = 0; k < 20; k++){
				arr[i][k] = 'O';
			}
		}
		int day = 0; //day indicator
		System.out.println("Please enter the amount of cells you want");
		int a = sc.nextInt();//gets who many cells the user wants to enter
		int rows = 0; 
		int columns = 0;
		System.out.println("Please enter the corrodinates (row column) (between 0-19)");	
		for(int b = 0; b < a; b++){//gets the coordinates of where the user wants
			rows = sc.nextInt(); //the cell to be located and fills that place 
			columns = sc.nextInt();//with a X
			arr[rows][columns] = 'X';
		}
		System.out.print("Day " + day);//outputs the original cells
		for(int i = 0; i < 20; i++){
			System.out.println();
			for(int k = 0; k < 20; k++){
				System.out.print(arr[i][k]);
			}
		}
		boolean replay = true; //boolean variable to determine if the user want to 
		while(replay == true){//replay the game 
			char[][] holder = new char [20][20];//2D char array that will hold the new cell 
			for(int i = 0; i < 20; i++){
				for(int k = 0; k < 20; k++){
					holder[i][k] = 'O';//clears the array after every day
				}
			}
			for(int m = 0; m < 20; m++){
				for(int n = 0; n < 20; n++){
					if(arr[m][n] == 'X'){
						//checks to see if a cell will stay alive
						if(alive(arr, m, n) == true){//alive
							holder[m][n] = 'X';
						}
						else{//dead
							holder[m][n] = 'O';
						}
					}
					else{
						//checks to see if a cell will revive
						if(alive(arr, m, n) == true){//alive
							holder[m][n] = 'X';
						}
						else{//dead
							holder[m][n] = 'O';
						}
					}
				}
			}
			arr = holder;
			day++;
			System.out.println();
			
			for(int i = 0; i < 20; i++){
				//print the day of the cycle and the 2D array in grid form
				if(i == 0){
					System.out.println("Day " + day);
				}
				else{
				System.out.println();
				}
				for(int k = 0; k < 20; k++){
					System.out.print(arr[i][k]);
				}
			}
			if(allZeroes(arr) == true){//checks to see if all cells are dead
				System.out.println();
				System.out.println("You died");
				replay = false;
			}
			else{
				System.out.println();
				System.out.println("Do you want to paly again (yes/no)");
				String inputed = sc.nextLine();
				//all cells are not dead checks to see if you want to play again
				if (inputed.equals("yes")){
					if(inputed.equals("yes")){
						replay = true;
					}
					else if(inputed.equals("no") || inputed.equals("no")){
						replay = false;
					}
				}
				else{
					String input = sc.nextLine();
					if(input.equals("yes")){
						replay = true;
					}
					else if(input.equals("no") || inputed.equals("no")){
						replay = false;
					}
					else{
						System.out.println("Unvalid input");
						replay = false;
					}
				}
			}
		}
		sc.close();
	}
	public static boolean alive (char[][] around, int m, int n){
		//checks the surrounding spaces for alive cells
		int yes = 0;//counting variable 
		if(m - 1 >= 0 && n - 1 >= 0){//makes sure nothing out of bounds
			if(around[m-1][n-1] == ('X')){//checks if the space has an X
				yes++;
			}
		}
		if(m - 1 >= 0){
			if(around[m-1][n] == ('X')){
				yes++;
			}
		}
		if(n - 1 >= 0){
			if(around[m][n-1] == ('X')){
				yes++;
			}
		}

		if(m + 1 < 20 && n + 1 < 20){	
			if(around[m+1][n+1] == ('X')){
				yes++;
			}
		}
		if(m + 1 < 20){
			if(around[m+1][n] == ('X')){
				yes++;
			}
		}
		if(n + 1 < 20){
			if(around[m][n+1] == ('X')){
				yes++;
			}
		}

		if(m + 1 < 20 && n - 1 >= 0){
			if(around[m+1][n-1] == ('X')){
				yes++;
			}
		}
		if(m - 1 >= 0 && n + 1 < 20){
			if(around[m-1][n+1] == ('X')){
				yes++;
			}
		}

		if(around[m][n] == ('X')){//if the cell in the middle equals X
			if(yes == 2 || yes == 3){//checking to see if the cell will stay alive
				return true;
			}
			else{
				return false;
			}
		}
		else{//if the cell in the middle does not equals X
			if(yes == 3){//checking to see if the cell will be revived
				return true;
			}
			else{
				return false;
			}
		}

	}
	public static boolean allZeroes (char[][] check){
		//checks if alll of the cells are dead or alive
		for(int a = 0; a < 20; a++){
			for(int b = 0; b < 20; b++){
				if(check[a][b] == 'X'){
					return false;
				}
			}
		}
		return true;
	}
}
