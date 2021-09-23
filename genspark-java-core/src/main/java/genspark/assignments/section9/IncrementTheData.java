package genspark.assignments.section9;

import genspark.assignments.Assignment;

import java.util.ArrayList;

public class IncrementTheData implements Assignment {
    public Object solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return nums.stream().map((x) -> x + 10).toArray();
    }
}
