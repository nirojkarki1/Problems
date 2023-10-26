package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.Stack;

public class ParenthesisBalance implements Assignment {
    public String solution(String s) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
          String sresult = "balanced";
        Stack <Character> stack = new Stack<>();
        if(!s.isEmpty()){
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[' || c == '{' || c == ' ') {
                    stack.push(c);
                } else if (c == ')' || c == ']' || c == '}') {
                    if (stack.isEmpty()) {
                        return "unbalanced";
                    }
                    char top = stack.pop();
                    if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                        return "unbalanced";
                    }
                }
            }
            return stack.isEmpty() ?"balanced" : "unbalanced";
        }
        else{
            return "unbalanced";
        }
    }
}
