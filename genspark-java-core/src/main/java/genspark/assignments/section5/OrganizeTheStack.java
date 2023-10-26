package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.Stack;

public class OrganizeTheStack implements Assignment {
    public Stack<Integer> solution(Stack<Integer> stack) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
         Stack<Integer> tmpStack = new Stack<>();

         Stack<Integer> positiveStack = new Stack<>();
         Stack <Integer> negativeStack = new Stack<>();

         while (!stack.isEmpty()){
             int num = stack.pop();
             if(num >= 0){
                 positiveStack.push(num);
             }
             else {
                 negativeStack.push(num);
             }
         }
         // Sort the positive stack in descending order using tmp stack
        while (!positiveStack.isEmpty()){
            int tmp = positiveStack.pop();
            while(!tmpStack.isEmpty() && tmp > tmpStack.peek()){
                positiveStack.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        while (! tmpStack.isEmpty()){
            positiveStack.push(tmpStack.pop());
        }
        // Sort the negative stack in descending order using the tmp.
        while (!negativeStack.isEmpty()){
            int tmp = negativeStack.pop();
            while (!tmpStack.isEmpty() && tmp > tmpStack.peek()){
                negativeStack.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        while (! tmpStack.isEmpty()){
            negativeStack.push(tmpStack.pop());
        }

        // Finally, merge the two sorted satacks into the origin.

        while(!positiveStack.isEmpty()){
            stack.push(positiveStack.pop());
        }
        while (!negativeStack.isEmpty()){
            stack.push(negativeStack.pop());
        }

        return stack;
    }
}
