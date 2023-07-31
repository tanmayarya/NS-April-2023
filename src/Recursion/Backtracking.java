package Recursion;

public class Backtracking {
	
	public static void nQueens(int arr[][], int row) {
		if(row == arr.length) {
			printBoard(arr);
			return;
		}
		
		for(int col = 0; col < arr[0].length; col++) {
			if(isSafe(arr, row, col)) {
				arr[row][col] = 1;
				nQueens(arr, row + 1);
				arr[row][col] = 0;
			}
		}
	}
	
	public static boolean isSafe(int arr[][], int row, int col) {
		
		// no need to check horizontally
		
		// vertically
		for(int i = 0; i < row; i++)
			if(arr[i][col] == 1) return false;
		
		// positive/ left upper diagonal
		for(int i = row, j = col; i >= 0 && j >= 0; i--, j--)
			if(arr[i][j] == 1) return false;

		// positive/ left upper diagonal
		for(int i = row, j = col; i >= 0 && j < arr[0].length; i--, j++)
			if(arr[i][j] == 1) return false;
		
		
		return true;
	}
	
	
	public static void printBoard(int arr[][]) {
		System.out.println("****************");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int arr[][] = new int[n][n];
//		printBoard(arr);
		
		nQueens(arr, 0);

	}

}
