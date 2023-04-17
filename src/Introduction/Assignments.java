package Introduction;

public class Assignments {

	public static void trainglePattern2(int n) {
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	
	public static void trainglePattern1(int n) {
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void patternNxN(int n) {
		for(int row = 1; row <= n; row++) {
			// For each row
			for(int col = 1; col <= n; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void For_Loop(int n){
	    // for(int i = 1; i <= n; i++) {
	    //     if(i % 2 == 0) {
	    //         System.out.print(i + " ");
	    //     }
	    // }

	    for(int i = 2; i <= n; i += 2) {
	        System.out.print(i + " ");
	    }
	}
	
	static void magicTrick(int a, int b){
		System.out.println(a + b/2);
	}
	
	static void stepsExecute(int N){
		 int ans = N;
		ans += 8;
		ans /= 3;
		ans %= 5;
		ans *= 5;
		System.out.println(ans);

		// ans = (((N + 8) / 3) % 5) * 5;
	}

	public static void main(String[] args) {
		int n = 4;	
		
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
