package genspark.assignments.section4;

import genspark.assignments.Assignment;
public class ReversePositiveInteger implements Assignment {
    public int solution(int number) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());
    }
}
