package HashMap;

import java.util.*;
import java.util.Map.Entry;

public class Intro {
	public static void main(String[] args) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('a', 2);
		map.put('b', 5);
		
//		Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next().getValue());
//		}
		
//		for(Entry<Character, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " -> " + entry.getValue());
//		}
		
		map.forEach((key, value) -> {
			System.out.println(value);
		});
		
	}

}
