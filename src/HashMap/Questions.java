package HashMap;

import java.util.HashMap;

public class Questions {
	
	public static int countSubarraysWithSum0(int arr[]) {
		int ans = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int psum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			psum += arr[i];
			if(map.containsKey(psum)) {
				ans += map.get(psum);
			}
			map.put(psum, map.getOrDefault(psum, 0) + 1);
		}
		return ans;
	}

	
	public static int lengthOfLongestSubarrayWithSum0(int arr[]) {
		int ans = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int psum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			psum += arr[i];
			if(map.containsKey(psum)) {
				ans = Math.max(ans, i - map.get(psum));
			}
			else 
				map.put(psum, i);
		}
		return ans;
	}
	
	public static int countSubarraysWithSumK(int arr[], int k) {
		int ans = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int psum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			psum += arr[i];
			if(map.containsKey(psum - k)) {
				ans += map.get(psum - k);
			}
			map.put(psum, map.getOrDefault(psum, 0) + 1);
		}
		
		return ans;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
//		System.out.println(countSubarraysWithSum0(arr));
//		System.out.println(lengthOfLongestSubarrayWithSum0(arr));
		System.out.println(countSubarraysWithSumK(arr, 2));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
