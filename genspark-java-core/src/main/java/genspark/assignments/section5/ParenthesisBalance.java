package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.Stack;

public class ParenthesisBalance implements Assignment {
    public String solution(String s) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(s.isEmpty()) {
            return "unbalanced";
        }

        var sta = new Stack<String>();

        for(var e: s.split("")) {
            if(e.equals("(")) {
                sta.push(e);
            } else if(e.equals(")")) {
                if(sta.isEmpty()) {
                    return "unbalanced";
                } else {
                    sta.pop();
                }
            }
        }

        if(sta.isEmpty()) {
            return "balanced";
        }

        return "unbalanced";
    }
}
