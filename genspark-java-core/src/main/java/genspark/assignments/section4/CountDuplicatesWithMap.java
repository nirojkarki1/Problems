package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDuplicatesWithMap implements Assignment {
    public HashMap<Integer,Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        HashMap<Integer, Integer> countDups = new HashMap<>();
        for(var e : nums) {
            if(countDups.containsKey(e)){
                countDups.put(e, countDups.get(e)+1);
            } else {
                countDups.put(e, 1);
            }
        }

        return countDups;
    }
}
