package genspark.assignments.section7;

import genspark.assignments.Assignment;

import java.util.stream.Stream;

public class ReverseAStringReduce implements Assignment {
    public String solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
         String reverseWord = word.chars().mapToObj(c ->(char)c).reduce("",(s,c) ->c+s, (s1,s2) ->s2+s1);
        return reverseWord;
    }
}
