package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collectors;

public class OrganizeTheStack implements Assignment {
    public Stack<Integer> solution(Stack<Integer> stack) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        var kek = stack.stream().sorted().collect(Collectors.toList());
        Collections.reverse(kek);
        var retStack = new Stack<Integer>();
        kek.forEach(retStack::push);
        return retStack;
    }
}
