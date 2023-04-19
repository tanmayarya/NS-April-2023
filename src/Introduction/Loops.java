package Introduction;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Loops {
	
	public static void isPrime(int n) {
		boolean isPrime = true;
		for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) System.out.println("Prime");
		else System.out.println("Not prime");
	}
	
	public static void pattern1(int n) {
		/* n = 5
		5 
		4 4 
		3 3 3 
		2 2 2 2 
		1 1 1 1 1 
		*/
		
		// to Print n rows
		for(int row = 1; row <= n; row++) {
			
			// print 1 row,col => row number of times
			for(int col = 1; col <= row; col++) {
				System.out.print(n + 1 - row + " ");
			}
			System.out.println();
		}

	}
	
	public static void pattern2(int n) {
		/* n = 5
		5 
		5 4 
		5 4 3 
		5 4 3 2 
		5 4 3 2 1 
		 */
		
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print(n + 1 - col + " ");
			}
			System.out.println();
		}
	}
	
	public static void pattern3(int n) {
		/* n = 5
		 	*
		   **
		  ***
		 ****
		*****
		*/
		
//		for(int row = 1; row <= n; row++) {
//		// To print space
//		for(int col = 1; col <= n - row; col++) 
//			System.out.print(" ");
//		
//		// prints star
//		for(int col = 1; col <= row; col++) 
//			System.out.print("*");
//		
//		System.out.println();
//		
//	}
	
	for(int row = 1; row <= n; row++) {
     	// To print space
		for(int col = 1; col <= n; col++) {
			if(row + col <= n)
				System.out.print(" ");
			else System.out.print("*");
		}
		System.out.println();
	}

	}
	
	
	
	public static void main(String[] args) {
		int n = 5;
		
	}
}
