package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxSubArray implements Assignment {

    List<Integer> helper(List<Integer> l1, List<Integer> l2){
        return
                l1.stream().reduce(0, Integer::sum) >=
                        l2.stream().reduce(0, Integer::sum) ?
                        l1 : l2;
    }

    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(nums.isEmpty()){
            return new ArrayList<>();
        }
        if(nums.size() == 1 ){
            return nums;
        }
        //[-2 -1 2 1 2 5 4 -5]
        var max = nums.subList(0,1);
        System.out.println("NEW ITERATION\n\n\n");
        for(int i = 0; i < nums.size(); i++){
            for (int j = 0; j < nums.size() - i; j++){
                max = helper(max, nums.subList(j, j + i + 1));
            }

        }
        // remove trailing zeros, woohoo
        if(max.size() == 1) {
            return new ArrayList<>(max);
        }
        max = max.stream().dropWhile(i -> i == 0).collect(Collectors.toList());
        Collections.reverse(max);
        max = max.stream().dropWhile(i -> i == 0).collect(Collectors.toList());
        Collections.reverse(max);
        return new ArrayList<>(max);
    }
}
