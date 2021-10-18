package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.ArrayList;

public class FindMaxMinArray implements Assignment {
    public ArrayList<Long> solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Long> solution = new ArrayList<>();

        if(nums.length == 0) {
            solution.add((long) 0);
            solution.add((long) 0);
            return solution;
        }

        int greater = nums[0];
        int lesser = nums[0];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < lesser) {
                lesser = nums[i];
            }
            if(nums[i] > greater) {
                greater = nums[i];
            }
        }

        solution.add((long) greater);
        solution.add((long) lesser);

        return solution;
    }
}
