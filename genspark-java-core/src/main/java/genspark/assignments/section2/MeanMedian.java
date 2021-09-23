package genspark.assignments.section2;

import genspark.assignments.Assignment;

import java.util.stream.Stream;

public class MeanMedian implements Assignment {
    public String solution(int a, int b, int c) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        float testMean = (a + b + c) / 3f;
        return testMean + " " + Stream.of(a, b, c).sorted().toArray()[1];
    }
}
