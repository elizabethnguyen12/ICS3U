package nguyen;

public class pythagoreanTriple {

	public static void main(String[] args) {
		for (int a=1; a<100; a++){
			for (int b=1; b<100; b++) {
				for (int c = 1; c < Math.pow(b, 2) + Math.pow(a,  2); c++){ 
					if (Math.pow(b, 2) + Math.pow(a, 2) == Math.pow(c,  2) && perfectSquare(c)){ 
						System.out.println(a + " " + b + " " + c); 
					} 


				}
			}
		}
	}


	/**
	 * Sees if word's a palindrome or not
	 * @param x is a string that is compared to the palindrome
	 * @return true/false
	 */
		public static boolean perfectSquare(int a) {
			int x = (int)Math.sqrt(a);
			double check = Math.pow(x, 2);
			if (check == x) {
				return true;
			} else {
				return false;
			}
		}

	}
