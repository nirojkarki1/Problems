package genspark.assignments.section9;

import genspark.assignments.Assignment;

import java.util.Arrays;

public class RemoveOddsFromArray implements Assignment {
    public int[] solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return Arrays.stream(nums).filter((x -> x % 2 == 0)).toArray();
    }
}
