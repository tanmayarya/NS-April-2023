package Practice;

import java.util.*;

public class RamsProgram {
	public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      while(t-- > 0) {
        String str = scn.next();
        boolean isWinning = true;
        int l = 0, r = str.length() - 1;
        while(l < r) {
          if(str.charAt(l) != str.charAt(r)) {
            isWinning = false; 
            break;
          }
          l++; 
          r--;
        }
        if(isWinning) System.out.println("wins");
        else System.out.println("loses");
      }
		
  }
}
