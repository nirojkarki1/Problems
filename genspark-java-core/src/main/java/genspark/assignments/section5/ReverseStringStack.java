package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.Stack;

public class ReverseStringStack implements Assignment {
    public String solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Stack<Character> stack = new Stack<>();
        StringBuilder solution = new StringBuilder();

        for(int i = word.length()-1; i >= 0; i--) {
            stack.push(word.charAt(i));
        }

        for(var e: stack) {
            solution.append(e);
        }

        return solution.toString();
    }
}
