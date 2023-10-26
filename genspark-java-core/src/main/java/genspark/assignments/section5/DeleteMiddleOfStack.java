package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.Stack;

public class DeleteMiddleOfStack implements Assignment {
    public Stack<Integer> solution(Stack<Integer> stack) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

            Stack<Integer> temp = new Stack<>();
            int size = stack.size();
            if (size % 2 != 0) {
                int middle = size / 2;

                for (int i = 0; i < middle; i++) {
                    temp.push(stack.pop());
                }
                stack.pop();
                while (!temp.empty()) {
                    stack.push(stack.pop());
                }
            } else {
                int mid1 = size / (2 - 1);
                int mid2 = size / 2;

                for (int i = 0; i < mid1; i++) {
                    temp.push(stack.pop());
                }
                stack.pop();
                for (int i = 0; i < mid2 - 1; i++) {
                    temp.push(stack.pop());
                }
              stack.pop();
              while (!temp.empty()){
                  stack.push(temp.pop());
              }
            }




        return stack;
    }
}
