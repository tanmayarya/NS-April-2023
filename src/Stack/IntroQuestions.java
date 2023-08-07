package Stack;

import java.util.Stack;

public class IntroQuestions {
	
	public static boolean hasDuplicateBracket(String s) {
		
		Stack<Character> st  = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == ')') {
				if(st.peek() == '(') return true;
				while(st.peek() != '(') st.pop();
				st.pop();
			}else st.push(c);
		}
		return false;
	}
	
	public static boolean balanacedBrackets(String s) {
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i< s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(' || c == '[' || c == '{')
				st.push(c);
			else if(c == ')') {
				if(!st.isEmpty() && st.peek() == '(') st.pop();
				else return false;
			}
			else if(c == ']') {
				if(!st.isEmpty() && st.peek() == '[') st.pop();
				else return false;
			}
			else if(c == '}') {
				if(!st.isEmpty() && st.peek() == '{') st.pop();
				else return false;
			}
		}
		
		return true;
	}
	

	public static void main(String[] args) {
//		System.out.println(hasDuplicateBracket("((a + b)) / c"));
		System.out.println(balanacedBrackets("{[][][][][}]"));

	}

}
