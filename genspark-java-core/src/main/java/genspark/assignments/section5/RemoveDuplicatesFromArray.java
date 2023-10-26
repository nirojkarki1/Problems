package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesFromArray implements Assignment {
    public int[] solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
       //create a hashset to store unique values.
        Set<Integer> set = new HashSet<>();
        // loop through the array and add each value to the set
        for(int num: nums){
            set.add(num);
        }
        // convert the set back to an array
        int [] result = new int[set.size()];
        int i = 0;
        for(int num : set){
            result[i++] = num;
        }
        return result;

    }
}
