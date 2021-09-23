package genspark.assignments.section9;

import genspark.assignments.Assignment;

import java.util.Arrays;

public class SquaringAnArray implements Assignment {
    public int[] solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return Arrays.stream(nums).map((x) -> x * x).toArray();
    }
}
