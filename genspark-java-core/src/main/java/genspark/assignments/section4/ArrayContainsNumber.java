package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.stream.IntStream;

public class ArrayContainsNumber implements Assignment {
    public boolean solution(int[] nums, int num) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        boolean test = IntStream.of(nums).anyMatch(x -> x== num);
        return test;
    }
}
