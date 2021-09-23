package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.Stack;

public class DeleteMiddleOfStack implements Assignment {
    public Stack<Integer> solution(Stack<Integer> stack) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(stack.isEmpty()) {
            return stack;
        }
        int idx = stack.size() / 2;
        if(stack.size() % 2 == 0) {
            idx--;
        }
        ArrayList<Integer> list = new ArrayList<>(stack);
        list.remove(idx);
        stack.clear();
        for(var e : list) {
            stack.push(e);
        }
        return stack;
    }
}
