package practice;

import java.util.Stack;

public class BalancedParanthesisCheck {

	public static void main(String[] args) {
		
		String str = "((({{{[[a]]}}})))";

		Stack<Character> st = new Stack<>();

		//Traverse a string
		for(int i = 0; i < str.length(); i++) {

			/* If the current character is starting bracket,
              then push them in a stack
			 */
			if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
				st.push(str.charAt(i));

				/* 
              Else, If the stack is not empty,
              And current character is a closing bracket
              and top character of a stack is matching open bracket
              then pop it.
				 */
			} else if ( !st.empty() && ((str.charAt(i) == ']' && st.peek() == '[') || 
					(str.charAt(i) == '}' && st.peek() == '{') ||
					(str.charAt(i) == ')' && st.peek() == '('))) {

				st.pop();
			} 
		}

		if(st.empty()) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not balanced");
		}
	}

}
