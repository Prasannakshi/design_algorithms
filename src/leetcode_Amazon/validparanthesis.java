package leetcode_Amazon;

import java.util.Stack;

/**
 * Created by Prasannakshi on 4/28/2017.
 */
public class validparanthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
        String input = "({)}[]";
        System.out.print(isValid(input));
    }
}
