package one;

import java.util.*;

public class ValidParenthesis
{

    public static void main(String[] args)
    {
        new ValidParenthesis().isValid("(){}}{");
    }

    public boolean isValid(String s) {
        if (s.length() == 1) return false;

        Deque<Character> stack = new ArrayDeque<>();

        stack.push(s.charAt(0));

        for(int i = 1; i < s.length(); i++){
            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else if(stack.isEmpty()) return false;
            else if(s.charAt(i) == ']'){
                if (stack.peek() == '[') stack.pop();
                else return false;
            }
            else if(s.charAt(i) == ')'){
                if (stack.peek() == '(') stack.pop();
                else return false;
            }
            else if(s.charAt(i) == '}'){
                if (stack.peek() == '{') stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }

}
