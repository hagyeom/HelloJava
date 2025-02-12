package chapter13.lecture;

import java.util.Stack;

public class BracketValidator {
    public static void main(String[] args) {
        System.out.println(isValid("))))))))")); // false
        System.out.println(isValid("(((())))")); // true
        System.out.println(isValid("()))))")); // false
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else { // ')' 닫는 괄호일때
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if (c == ')' && open != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
