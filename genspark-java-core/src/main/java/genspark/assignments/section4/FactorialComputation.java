package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.stream.IntStream;

public class FactorialComputation implements Assignment {
    public int solution(int n) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return IntStream.rangeClosed(1,n).reduce((acc, num) -> acc * num).orElse(0);
    }
}
