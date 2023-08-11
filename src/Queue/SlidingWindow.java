package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindow {
	public static void maxInWindowK(int arr[], int k) {
		Deque<Integer> dq = new ArrayDeque<>();
		// analyze first window 
		for(int i = 0; i < k; i++) {
			while(!dq.isEmpty() && arr[dq.getLast()] < arr[i]) 
				dq.removeLast();
			
			dq.addLast(i);
		}
		System.out.println(arr[dq.getFirst()]);
		
	//	analyze remaining windows 
		for(int i = k; i < arr.length; i++) {
			// remove the effect of elements out of current window
			while(dq.getFirst() <= i - k)
				dq.removeFirst();
			
			// Add the effect of new element of current window
			while(!dq.isEmpty() && arr[dq.getLast()] < arr[i]) 
				dq.removeLast();
			
			dq.addLast(i);
			
			System.out.println(arr[dq.getFirst()]);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 9, 3, 2, 7, 4, 5};
		maxInWindowK(arr, 3);;
	}
	
}
