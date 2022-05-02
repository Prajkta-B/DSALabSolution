package balancedBrackets_Check;

import java.util.Stack;

public class balancedBrackets {
	public boolean balancedBracketsCheck(String brackets) {
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < brackets.length(); i++)
		{
			char x = brackets.charAt(i);

			if (x == '(' || x == '[' || x == '{')
			{     
				st.push(x);
				continue;
			}

			if (st.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = st.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = st.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = st.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}
		return (st.isEmpty());
	}
}
