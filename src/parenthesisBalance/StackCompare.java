package parenthesisBalance;

import java.util.Stack;

public class StackCompare {
	public boolean valdate(String input) {
		Stack<Character> stack = new Stack<>();
		for (char i : input.toCharArray()) {
			if (i == '{' || i == '[' || i == '(') {
				stack.push(i);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char z;
			switch (i) {
			case '}':
				z = stack.pop();
				if (z != '{')
					return false;
				break;

			case ']':
				z = stack.pop();
				if (z != '[')
					return false;
				break;
			case ')':
				z = stack.pop();
				if (z != '(')
					return false;
				break;
			}
		}
		return(stack.isEmpty());
	}
}
