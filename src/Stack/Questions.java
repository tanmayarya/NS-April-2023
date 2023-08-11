package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Questions {
	
	public static int maxAreaRectangle(int arr[]) {
		Stack<Integer> st = new Stack<>();
		
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
				int area;
				int indexToProcess = st.pop();
				if(st.isEmpty()) {
					area = (i - (-1) - 1) * arr[indexToProcess];
				} else {
					area = (i - st.peek() - 1) * arr[indexToProcess];
				}
				max = Math.max(max, area);				
			}
			st.push(i);
		}
		int n = arr.length;
		while(!st.isEmpty()) {
			int area;
			int indexToProcess = st.pop();
			if(st.isEmpty()) {
				area = (n - (-1) - 1) * arr[indexToProcess];
			} else {
				area = (n - st.peek() - 1) * arr[indexToProcess];
			}
			max = Math.max(max, area);
		}
		
		return max;
	}

	public static void main(String[] args) {
		int arr[] = {2, 1, 5, 6, 2, 3};
		System.out.println(maxAreaRectangle(arr));
		
		Deque<Integer> dq = new ArrayDeque<>();
	}
}
