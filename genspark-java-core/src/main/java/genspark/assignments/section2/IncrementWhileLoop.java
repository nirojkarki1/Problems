package genspark.assignments.section2;

import genspark.assignments.Assignment;
public class IncrementWhileLoop implements Assignment {
    public String solution(int from, int to) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        StringBuilder builder = new StringBuilder(from);
        while(from <= to) {
            builder.append(from);
            from++;
        }
        return builder.toString();
    }
}
