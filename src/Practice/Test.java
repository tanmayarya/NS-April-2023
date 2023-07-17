package Practice;

import java.util.HashSet;
import java.util.List;

public class Test {
	
	public static boolean hasRepeated(int n) {
		HashSet<Integer> set = new HashSet<>();
		while(n > 0) {
			int digit = n % 10;
			if(set.contains(digit)) return true;
			set.add(digit);
			n /= 10;
		}
		return false;
	}
	
	public static void countNumbers(List<List<Integer>> arr) {
		int count = 0;
		for(List<Integer> list : arr) {
			for(int i = list.get(0); i <= list.get(1); i++) {
				if(!hasRepeated(count)) count++;
			}
				
		}
		
		System.out.println(count);
	}

}
