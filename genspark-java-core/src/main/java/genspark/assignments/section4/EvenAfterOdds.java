package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.ArrayList;

public class EvenAfterOdds implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(Integer i : nums) {
            if(i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        odd.addAll(even);
        return odd;
    }
}
