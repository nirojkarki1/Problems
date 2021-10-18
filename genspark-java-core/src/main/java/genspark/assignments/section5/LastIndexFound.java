package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.ArrayList;

public class LastIndexFound implements Assignment {
    public int solution(ArrayList<Integer> nums, int numToFind) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        for(int i = nums.size()-1; i >= 0; i--) {
            if(nums.get(i) == numToFind) {
                return i;
            }
        }
        return -1;
    }
}
